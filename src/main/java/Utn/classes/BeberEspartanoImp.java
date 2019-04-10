package Utn.classes;

import Utn.interfaces.Beber;

public class BeberEspartanoImp implements Beber {
    public BeberEspartanoImp() {
    }

    @Override
    public void beber() {
        System.out.println("Hola soy un espartano bebiendo");
    }
}
