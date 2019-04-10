package Utn;

import Utn.classes.BeberEspartanoImp;
import Utn.classes.BeberVikingoImp;
import Utn.classes.OrinarVikingoImp;
import Utn.classes.Vikingo;

public class App 
{

    public static void main(String[] args )
    {
        Vikingo v1 = new Vikingo("Cristian", 22, 100, new OrinarVikingoImp(), new BeberVikingoImp(), 25);
        v1.getBeber().beber();
    }
}
