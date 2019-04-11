package Utn.classes;

import Utn.interfaces.Orinar;

public class OrinarVikingoImp implements Orinar {
    public OrinarVikingoImp() {
    }

    @Override
    public void orinar() {
        System.out.println("Soy un Vikingo orinando, perdi.");
    }
}
