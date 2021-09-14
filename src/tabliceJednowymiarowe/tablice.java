package tabliceJednowymiarowe;

public class tablice {
    public static void main(String[] args) {
        // arrays - są określonych rozmiarów, przechowujemy dane informacje danego typu

        //deklaracja
        int[] tablica;
        tablica = new int[10];

        //przypisywanie wartości
        tablica[0] = 5; // tablica[indeks], do tablicy o elemencie 0 przypisano wartość 5, PIERWSZY ELEMENT TABLICY MA 0, element tablicy to indeks
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;

        //odwoływanie się

        System.out.println(tablica[3]); //jak wpisałabym np 5 czyli nieistn. to wywali wartość domyślną dla inta

        //inny sposób deklaracji i przypisania wartości

        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.11;
        System.out.println(tablicaDouble[3]);

        int[] nowaTablicaIntow = new int[] {10, 50, 99, 101, 55};

        System.out.println("nowaTablicaIntow: " + nowaTablicaIntow[0]);

        // jakiego rozmiaru są tablice?

        System.out.println("tablica rozmiar: " + tablica.length);
        System.out.println("tablicaDouble rozmiar: " + tablicaDouble.length);
        System.out.println("tablicaCharow rozmiar: " + nowaTablicaIntow.length);



    }

}
