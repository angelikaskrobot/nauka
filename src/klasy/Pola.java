package klasy;

public class Pola {
    public static void main(String[] args) {
        KlasaZPolami obiekt = new KlasaZPolami();
        KlasaZPolami obiekt2 = new KlasaZPolami();
        KlasaZPolami obiekt3 = new KlasaZPolami();
        obiekt2.liczbaCalkowita = 20;
        obiekt.liczbaCalkowita = 15;

        System.out.println(obiekt.kolorObiektu);
        System.out.println(obiekt2.kolorObiektu);
        System.out.println(obiekt3.kolorObiektu);
        System.out.println(obiekt3.kolorObiektu);

        System.out.println(obiekt.liczbaCalkowita);
        PrzyciskZKolorami przycisk = obiekt.przycisk;
        int liczba = obiekt.liczbaCalkowita;
        obiekt.zwrocWartoscPola();
        obiekt.ustawWartoscPola(101);
        obiekt.zwrocWartoscPola();

        obiekt.ustawWartoscPola(202);
        int zmienna = obiekt.zwrocWartoscPolaZMetody();
        System.out.println("Zmienna: " + zmienna);
    }
}
