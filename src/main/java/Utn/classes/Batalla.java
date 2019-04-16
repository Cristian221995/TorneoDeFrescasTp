package Utn.classes;

public class Batalla {
    public Batalla() {
    }

    public Humano batalla(Vikingo vikingo, Espartano espartano){
        int contador = 1;
        Humano ganador = null;

        Conectar connect = new Conectar();
        while(contador<=vikingo.getBebedorProfesional() && contador<=espartano.getToleranciaExtra()){
            vikingo.getBeber().beber();
            espartano.getBeber().beber();

            if(contador==vikingo.getBebedorProfesional() && contador==espartano.getToleranciaExtra()){
                vikingo.getOrinar().orinar();
                espartano.getOrinar().orinar();
                System.out.println("\nAmbos jugadres perdieron");
            }else if(contador==vikingo.getBebedorProfesional()){
                vikingo.getOrinar().orinar();
                System.out.println("\nEl ganador es el Espartano: " + espartano.toString());
                ganador=espartano;
                connect.guardarGanadores("insert into ganadores (nombre, bebida_en_cuerpo) values('"+espartano.getNombre()+"',"+contador+")");
            }else if(contador==espartano.getToleranciaExtra()){
                espartano.getOrinar().orinar();
                System.out.println("\nEl ganador es el Vikingo: " + vikingo.toString());
                ganador=vikingo;
                connect.guardarGanadores("insert into ganadores (nombre, bebida_en_cuerpo) values('"+vikingo.getNombre()+"',"+contador+")"  );
            }
            contador ++;
        }

        return ganador;
    }

    public void peleaBoss(Humano boss, Humano ganador){
        int puntosBoss = (int) (Math.random() * 1000);
        int puntosGanador = 0;

        if(ganador instanceof Vikingo){
            puntosGanador = ((Vikingo) ganador).getBebedorProfesional();
        }else{
            puntosGanador = ((Espartano) ganador).getToleranciaExtra();
        }

        if(puntosBoss>puntosGanador){
            System.out.println("\nEl Boss ha ganado el enfrentamiento, ha tomado " + puntosBoss + " cervezas, " + ganador.getNombre() + " perdio.");
        }else{
            System.out.println(ganador.getNombre() + " ha ganado al Boss, tomando " + puntosGanador + " cervezas, es un dios!");
        }
    }

    public void historialDeGanadores(){
        Conectar connect = new Conectar();
        connect.getGanadores();
    }
}
