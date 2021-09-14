package petle;

import java.sql.SQLOutput;

public class petle {
    public static void main(String[] args) {
        // loops

        //for zmienna; ile ma się wykonac, co ma sie stac po wykonaniu
        int liczenie;
        for (liczenie = 1; liczenie <= 10; liczenie++) {
            System.out.println("Tekst " + liczenie);
        }
        System.out.println("Poza pętlą: " + liczenie);

        //while

        int liczenie2 = 99;
        while(liczenie2 <= 10) {
            System.out.println("Tekst " + liczenie2);
            liczenie2++;
        }
        liczenie2 = 99;
        do {
            System.out.println("Tekst z do while " + liczenie2);
            liczenie2++;
        } while(liczenie2 <= 10);

        //break i continue

        int zmienna;
        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if(zmienna < 18) {
                continue;
            }
            System.out.println("Wartość zmiennej: " + zmienna);
        }

        for (zmienna = 1; zmienna <= 20; zmienna++) {
            if (zmienna == 18) {
                break;
            }
            System.out.println("Zmienna w drugiej pętli: " + zmienna);
        }
        for (zmienna = 1; ; zmienna++) {
            if(zmienna == 100) {
                break;
            }
            System.out.println("Trzeci for: " + zmienna);
        }

        //petle w tablicach
/*
        int[] tab = {123,123,123};

        for(int i = 0; i < 10; i++) {
            tab[i] = 5;
        }
        System.out.println(tab[5]);
*/
        //petla w petli
        int licznik = 0;
        int[][] tablica = new int[5][10];
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                licznik++;
                tablica[i][j] = licznik;
                System.out.println(licznik);
            }
        }
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println(tablica[i][j]);
            }
        }
    }
}
