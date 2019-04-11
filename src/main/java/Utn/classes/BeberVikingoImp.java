package Utn.classes;

import Utn.interfaces.Beber;

public class BeberVikingoImp implements Beber {
    public BeberVikingoImp() {
    }

    @Override
    public void beber(){
        System.out.println("Vikingo Bebiendo");
    }
}
