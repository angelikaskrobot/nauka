package tabliceWielowymiarowe;

public class tabliceWielowym {
    public static void main(String[] args) {
        //tablice wielowymiarowe roznica, że w jedno są w jednym rządku, a w wielo - wiele wymiarów

        int[][] tablicaDwuwymiarowa = new int[10][10];
        tablicaDwuwymiarowa[0][1] = 123; // zerowy wiersz i pierwsza kolumna
        tablicaDwuwymiarowa[4][8] = 190;

        System.out.println(tablicaDwuwymiarowa[4][8]);

        int[][] nowaTablica = {
                {1, 2, 3, 11, 12, 13}, // wiersz 0
                {4, 5, 6, 41, 42, 43} //wiersz 1
        }; // kolejne wiersze
        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);
        System.out.println("[1][2]: " + nowaTablica[1][2]);

        System.out.println("Rozmiar całej tablicy: " + nowaTablica.length);
        System.out.println("Rozmiar kolumny 0: " + nowaTablica[0].length);
        System.out.println("Rozmiar kolumny 1: " + nowaTablica[1].length);

        System.out.println("Rozmiar całej tablicy tablicaDwuwymiarowa: " + tablicaDwuwymiarowa.length);
        System.out.println("Rozmiar kolumny 0: " + tablicaDwuwymiarowa[0].length);
        System.out.println("Rozmiar kolumny 1: " + tablicaDwuwymiarowa[1].length);
        System.out.println("Rozmiar kolumny 2: " + tablicaDwuwymiarowa[2].length);
        System.out.println("Rozmiar kolumny 3: " + tablicaDwuwymiarowa[3].length);
        System.out.println("Rozmiar kolumny 9: " + tablicaDwuwymiarowa[9].length);

        // tablica trójwymiarowa

        int[][][] tablicaTrojwymiarowa = new int [5][6][11];


        //zadania

        //zadanie 1

        int[] tablicaJednowymiarowa = new int[5];
        tablicaJednowymiarowa[0] = 2;
        tablicaJednowymiarowa[1] = 3;
        tablicaJednowymiarowa[2] = 4;
        tablicaJednowymiarowa[3] = 5;
        tablicaJednowymiarowa[4] = 6;

        int sumaElementowTablic = tablicaJednowymiarowa[0] + tablicaJednowymiarowa[1] + tablicaJednowymiarowa[2] + tablicaJednowymiarowa[3] + tablicaJednowymiarowa[4];
        System.out.println("Suma elementów tablicy Jednowymiarowej: " + sumaElementowTablic);

        //zadanie 2

        double[][] tablicaDwuwymiarowa_2 = new double[3][5];
        tablicaDwuwymiarowa_2[0][0] = 3.5;
        tablicaDwuwymiarowa_2[0][1] = 5.5;
        tablicaDwuwymiarowa_2[0][2] = 1.0;
        tablicaDwuwymiarowa_2[0][3] = 6.7;
        tablicaDwuwymiarowa_2[0][4] = 2.3;

        tablicaDwuwymiarowa_2[1][0] = 0.5;
        tablicaDwuwymiarowa_2[1][1] = 0.5;
        tablicaDwuwymiarowa_2[1][2] = 0.0;
        tablicaDwuwymiarowa_2[1][3] = 0.7;
        tablicaDwuwymiarowa_2[1][4] = 0.3;

        tablicaDwuwymiarowa_2[2][0] = 11.5;
        tablicaDwuwymiarowa_2[2][1] = 21.5;
        tablicaDwuwymiarowa_2[2][2] = 4.0;
        tablicaDwuwymiarowa_2[2][3] = 3.7;
        tablicaDwuwymiarowa_2[2][4] = 7.3;

        double pierwszyWiersz = tablicaDwuwymiarowa_2[0][0] + tablicaDwuwymiarowa_2[0][1] + tablicaDwuwymiarowa_2[0][2] + tablicaDwuwymiarowa_2[0][3] + tablicaDwuwymiarowa_2[0][4];
        System.out.println("Wynik pierwszego wiersza: " + pierwszyWiersz);

        double drugiWiersz = tablicaDwuwymiarowa_2[1][0] + tablicaDwuwymiarowa_2[1][1] + tablicaDwuwymiarowa_2[1][2] + tablicaDwuwymiarowa_2[1][3] + tablicaDwuwymiarowa_2[1][4];
        System.out.println("Wynik drugiego wiersza: " + drugiWiersz);

        double trzeciWiersz = tablicaDwuwymiarowa_2[2][0] + tablicaDwuwymiarowa_2[2][1] + tablicaDwuwymiarowa_2[2][2] + tablicaDwuwymiarowa_2[2][3] + tablicaDwuwymiarowa_2[2][4];
        System.out.println("Wynik trzeciego wiersza: " + trzeciWiersz);


    }
}
