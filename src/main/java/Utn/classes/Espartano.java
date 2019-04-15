package Utn.classes;

import Utn.interfaces.Beber;
import Utn.interfaces.Orinar;

public class Espartano extends Humano{
    private Integer toleranciaExtra;

    public Espartano(String nombre, Integer edad, Integer peso, Orinar orinar, Beber beber, Integer toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString() {
        return "\n\nEspartano:" +
                "\ntoleranciaExtra=" + toleranciaExtra +
                super.toString();
    }
}
