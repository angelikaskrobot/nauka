package klasy;

public class KlasaZPolami {

    String kolor = "Czarny";
    String kolorObiektu;

    public KlasaZPolami(){
        kolorObiektu = kolor;
        if(kolor.equals("Czarny")){
            kolor = "Czerwony";
        }
        else{
            kolor = "Czarny";
        }
    }

    PrzyciskZKolorami przycisk;

    int liczbaCalkowita;

    void zwrocWartoscPola() {
        System.out.println("Zwrócona wartość pola: " + liczbaCalkowita);
    }
    void ustawWartoscPola(int wartosc) {
        liczbaCalkowita = wartosc;
    }
    int zwrocWartoscPolaZMetody() {
        return liczbaCalkowita;
    }
}
