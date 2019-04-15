package Utn;

import Utn.classes.*;

import java.util.*;

public class App 
{

    public static void main(String[] args )
    {
        List<Vikingo> vikingos = new ArrayList<Vikingo>();
        List<Espartano> espartanos = new ArrayList<Espartano>();

        vikingos = Arrays.asList(new Vikingo("Cristian", 23, (int) (Math.random() * 100) + 1, new OrinarVikingoImp(), new BeberVikingoImp(),(int) (Math.random() * 20) + 1 ),
                new Vikingo("Maxi", 20, (int) (Math.random() * 100) + 1, new OrinarVikingoImp(), new BeberVikingoImp(),(int) (Math.random() * 20) + 1 ),
                new Vikingo("Agustin", 18, (int) (Math.random() * 100) + 1, new OrinarVikingoImp(), new BeberVikingoImp(),(int) (Math.random() * 20) + 1 ),
                new Vikingo("Mauri", 21, (int) (Math.random() * 100) + 1, new OrinarVikingoImp(), new BeberVikingoImp(),(int) (Math.random() * 20) + 1 ));

        espartanos = Arrays.asList(new Espartano("Allan", 30, (int) (Math.random() * 100) + 1, new OrinarEspartanoImp(), new BeberEspartanoImp(),3 ),
                new Espartano("Mati", 23, (int) (Math.random() * 100) + 1, new OrinarEspartanoImp(), new BeberEspartanoImp(),(int) (Math.random() * 20) + 1 ),
                new Espartano("Gaston", 23, (int) (Math.random() * 100) + 1, new OrinarEspartanoImp(), new BeberEspartanoImp(),(int) (Math.random() * 20) + 1 ),
                new Espartano("Santi", 23, (int) (Math.random() * 100) + 1, new OrinarEspartanoImp(), new BeberEspartanoImp(),(int) (Math.random() * 20) + 1 ));

        System.out.println("-----------Vikingos:-----------\n" + vikingos);
        System.out.println("-----------Espartanos:-----------\n" + espartanos);
        System.out.println("----------------Ordenados Por Peso:----------------\n");
        vikingos.sort(Comparator.comparing(Vikingo::getPeso));
        espartanos.sort(Comparator.comparing(Espartano::getPeso));
        Collections.reverse(vikingos);
        Collections.reverse(espartanos);
        System.out.println("-----------Vikingos:-----------\n" + vikingos);
        System.out.println("-----------Espartanos:-----------\n" + espartanos);

        Espartano e1= espartanos.get(0);
        Vikingo v1= vikingos.get(0);

        System.out.println("----------Vikingo y Espartano a enfrentarse:----------\n" + v1.toString() + e1.toString());

        Batalla batalla = new Batalla();
        batalla.batalla(v1, e1);
    }
}
