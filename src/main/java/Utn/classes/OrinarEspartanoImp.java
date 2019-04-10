package Utn.classes;

import Utn.interfaces.Orinar;

public class OrinarEspartanoImp implements Orinar {
    public OrinarEspartanoImp() {
    }

    @Override
    public void orinar() {
        System.out.println("Soy un espartano orinando");
    }
}
