package instrukcjeWarunkowe;

import java.sql.SQLOutput;

public class instrukcjeWarunkowe {
    public static void main(String[] args) {
        // conditional statements
/*
        int wiek = 15;
        int wzrost = 170;

        if (wiek >= 18) {
            System.out.println("Warunek został spełniony!");
        } else if (wzrost < 200) {

            System.out.println("Warunek został spełniony!");

        } else {
            System.out.println("Warunek nie został spełniony!");
        }
    }
*/
        //instrukcja warunkowa switch - wielokrotnego wyboru

        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("Jeden"); // oprócz wykonania tego bloku, wykonają się kolejne przypadki, wykonujemy dla prymitywnych typów
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Nie spełniono żadnego warunku");
                break;
        }
        char pojedynczyZnak = 'b';
        switch (pojedynczyZnak) {
            case 'a':
                System.out.println("Podałeś małe a");
                break;
            case 'A':
                System.out.println("Podałeś duże A");
                break;
            default:
                System.out.println("Nic nie podano");
                break;
        }
        System.out.println("Będzie wykonywany if");
        switch (zmienna) {
            case 1:
                System.out.println("jeden");
                break;
            case 2:
                System.out.println("dwa");
                break;
            case 3:
                System.out.println("trzy");
                break;
            case 5:
                System.out.println("pięć");
                break;
            default:
                System.out.println("Nie znam tej liczby");
                break;
            }
        System.out.println("Kalendarz");
        int miesiac = 5;
        switch(miesiac) {
            case 1:
                System.out.println("Styczeń");
            case 2:
                System.out.println("Luty");
            case 3:
                System.out.println("Marzec");
            case 4:
                System.out.println("Kwiecień");
            case 5:
                System.out.println("Maj");
            case 6:
                System.out.println("Czerwiec");
            case 7:
                System.out.println("Lipiec");
            case 8:
                System.out.println("Sierpień");
            case 9:
                System.out.println("Wrzesień");
        }

    }
}
