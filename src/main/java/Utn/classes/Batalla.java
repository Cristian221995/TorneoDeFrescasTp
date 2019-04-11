package Utn.classes;

public class Batalla {
    public Batalla() {
    }

    public void batalla(Vikingo vikingo, Espartano espartano){
        int contador = 1;

        while(contador<=vikingo.getBebedorProfesional() && contador<=espartano.getToleranciaExtra()){
            vikingo.getBeber().beber();
            espartano.getBeber().beber();

            if(contador==vikingo.getBebedorProfesional()){
                vikingo.getOrinar().orinar();
                System.out.println("El ganador es el Espartano: " + espartano.toString());
            }else if(contador==espartano.getToleranciaExtra()){
                espartano.getOrinar().orinar();
                System.out.println("El ganador es el Vikingo: " + vikingo.toString());
            }
            contador ++;
        }

    }
}
