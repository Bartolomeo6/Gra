import java.util.*;

public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Witaj w losowaniu liczb");
        System.out.println("Losowanie 6-ciu liczb z zakresu 1-100");

        Gra gra1 = new Gra();
        gra1.zagraj();
        gra1.zagraj();
        Gra gra2 = new Gra();
        gra2.zagraj();

    }

}
