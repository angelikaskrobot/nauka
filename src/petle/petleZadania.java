package petle;

public class petleZadania {
    public static void main(String[] args) {
        //zadanie 1
        int licznik = 0;
        for(licznik = 0; licznik <= 30; licznik++) {
            System.out.println(licznik);

        }
        int licznik2 = 30;
        for (licznik2 = 30; licznik2 >= 0; licznik2--) {
            System.out.println(licznik2);

        }

        //zadanie 2

        for (int liczbyParzyste = 1; liczbyParzyste <= 30; liczbyParzyste++) {
            if(liczbyParzyste % 2 == 0 ) {
                System.out.println("Liczby Parzyste: " + liczbyParzyste);
            }
        }

        //zadanie 3

//        int a = 5;
//        int b = 10;

        for (int a = 5, b = 10;a <= b;a++){
            System.out.println(a);
        }

        //zadanie 4
        int[] tablica = new int[10];
        for(int tab = 0; tab < tablica.length; tab++) {
            tablica[tab] = tab;
        }
        for(int tab = tablica.length - 1; tab >= 0; tab--) {
            System.out.println(tablica[tab]);
        }
        //zadanie 5

        int wynikTablicy = 0;
        for(int tab = 0; tab < 10; tab++) {
            wynikTablicy = wynikTablicy + tablica[tab];
        }
        System.out.println(wynikTablicy);

        //zadanie 6

        long silniaWynik = 1;
        for (long silnia = 5; silnia >= 1; silnia--) {
            silniaWynik = (silniaWynik * silnia);
        }
        System.out.println("Wynik silni: " + silniaWynik);

        //zadanie 7

        /*for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //zadanie 8


        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(3-i < j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /// 2 petle
//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j <= 3-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
