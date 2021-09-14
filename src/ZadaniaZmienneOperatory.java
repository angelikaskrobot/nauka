import static java.lang.Math.pow;

public class ZadaniaZmienneOperatory {
    public static void main(String[] args) {
        //zadanie 1

        int angelikaWiek = 24;
        double angelikaWzrost = 1.70;
        int angelikaWaga = 70;

        System.out.println("Wiek Angeliki: " + angelikaWiek + " lat");
        System.out.println("Wzrost Angeliki: " + angelikaWzrost + " cm");
        System.out.println("Waga Angeliki: " + angelikaWaga + " kg");

        //zadanie 2

        double wskaznikBMI = pow((angelikaWaga / angelikaWzrost), 2);
        System.out.println("Wskaznik BMI wynosi: " + wskaznikBMI);

        //zadanie 3

        double wskaznikPrzedKonwersja = wskaznikBMI;
        int bmiKonwersja = (int)wskaznikPrzedKonwersja;

        System.out.println("Wskaznik BMI po konwersji do Integer wynosi: " + bmiKonwersja);

        //zadanie 4

        int liczbaCalkowita = 2;
        int wynikDzielenia_2 = liczbaCalkowita / 2;
        int resztaDzielenia_2 = liczbaCalkowita % 2;
        System.out.println("Wynik z dzielenia przez 2 wynosi: " + wynikDzielenia_2);
        System.out.println("Reszta z dzielenia przez 2 wynosi: " + resztaDzielenia_2);

        double wynikDzielenia_3 = (double) liczbaCalkowita / 3;
        int resztaDzielenia_3 = liczbaCalkowita % 3;
        System.out.println("Wynik z dzielenia przez 3 wynosi: " + wynikDzielenia_3);
        System.out.println("Reszta z dzielenia przez 3 wynosi: " + resztaDzielenia_3);

        double wynikDzielenia_11 = (double) liczbaCalkowita / 11;
        int resztaDzielenia_11 = liczbaCalkowita % 3;
        System.out.println("Wynik z dzielenia przez 11 wynosi: " + wynikDzielenia_11);
        System.out.println("Reszta z dzielenia przez 11 wynosi: " + resztaDzielenia_11);

        //zadanie 5

        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1;
        boolean wynikDrugi =  x < 10 && x != 0 && x > -1;
        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik drugi: " + wynikDrugi);

        //zadanie 6

        int mojInt = 1000000000;
        int pozaInt = mojInt + mojInt + mojInt; // po prostu dodawac inty, raz pokaże dodatnią, raz ujemną
        int pozaIntInnySposob = Integer.MAX_VALUE + 200;

        System.out.println("Poza int: " + pozaInt);

    }


}
