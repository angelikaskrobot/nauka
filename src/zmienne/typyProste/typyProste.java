package zmienne.typyProste;

public class typyProste {
    public static void main(String [] args) {

        //ang primitive types

        byte g; //liczba całkowita mniejsza od shorta, Byte.MIN i Byte.MAX od -128 do 127, ma osiem bitów
        byte zmiennaByte = 10;
        System.out.println("Byte: " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);

        short zmiennaShort = 200; // liczba całkowita ale przechowuje mniej niż int, ma 16 bitów
        System.out.println("Short: " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        int zmiennaInt = 1000000; //typ liczba całkowita
        System.out.println("Int: " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

        long zmiennaLong = 100000000000000L; // 64 bity
        System.out.println("Long: " + zmiennaLong);
        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

        //Liczby zmiennoprzecinkowe

        float zmiennaFloat = 10.3455555555555F; // traktowana jako double, musi kończyć się F, mniejszej precyzji, uzyskamy mniejsza dokładność
        System.out.println("Float: " + zmiennaFloat);
        System.out.println(Float.MIN_VALUE + " " + Float.MAX_VALUE);

        double zmiennaDouble = 10.3455555555555; // większa dokładność
        System.out.println ("Double: " + zmiennaDouble);

        // Pojedyncze znaki

        char zmiennaChar = 'a';
        System.out.println("Char: " + zmiennaChar);

        // Wartości logiczne

        boolean zmiennaBoolean = true; //true albo false
        System.out.println("Boolean: " + zmiennaBoolean);

        // deklaracja

        int a;
        int b;
        int c = 5;
        int nazwaZmiennej = 10;
        int d = 10, e, f, nazwaZmiennejDwa = 5; // można w jednej linii

        /* wartości domyślne dla typów prostych

        byte    0
        short   0
        int     0
        long    0L
        float   0.0f
        double  0.0d
        char    '\u0000'
        boolean false
         */

        // konwertowanie

        int i = 6;
        double d1 = 2.2;
        double d2 = (i / d1);
        System.out.println("Double d2: " + d2);

        // && and
        // || lub
        // +, -, *, /
        // == jest równe
        // <, >, >=
    }
}
