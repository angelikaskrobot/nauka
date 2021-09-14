package klasy;

public class Metody {
    public static void main(String[] args) {
        //methods

        KlasaDlaMetody nazwaObiektu = new KlasaDlaMetody();
        nazwaObiektu.metodaNicNieZwraca();
        nazwaObiektu.MetodaArgument(5, 'b'); // argument
        nazwaObiektu.KolejnaMetoda(false, 100);
        int wynikDodawania = nazwaObiektu.dodawanie(10, 5);
        System.out.println("wynikDodawanie: " + wynikDodawania);
        double wynikKolejnejMetody = nazwaObiektu.liczbaPoPrzecinku(0.20);
        System.out.println("Liczba po przecinku " + wynikKolejnejMetody);

        System.out.println("wartosc logiczna: " + nazwaObiektu.zamienWartoscLogiczna(true));

        int WartoscLogiczna = nazwaObiektu.zwrocOdWartosciLogicznej(false, 10);
        System.out.println("Wartość logiczna " + WartoscLogiczna);

    }

}
