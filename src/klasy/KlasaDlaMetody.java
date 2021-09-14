package klasy;

public class KlasaDlaMetody {
    // typZwracany nazwaMetody(parametry) {
    // }

    void metodaNicNieZwraca() {//nic nie zwraca
        System.out.println("Wartość wypisana z metody z dopisanym tekstem");
    }

    void MetodaArgument(int liczba, char pojedynczyZnak) { //parametr
        liczba++;
        System.out.println("Wartość z metody " + liczba + " " + pojedynczyZnak);
    }

    void KolejnaMetoda(boolean czyPokazac, int liczba2) {
        if(czyPokazac) {
            System.out.println("Liczba: " + liczba2);
        } else {
            System.out.println("Nie pozwolono pokazać!");
        }
    }
    int dodawanie(int a, int b) {
        int wynik = a + b;
        return wynik;
    }
    double liczbaPoPrzecinku(double liczba3) {
        double wynikKolejnejMetody = liczba3 + 0.55;
        return wynikKolejnejMetody;
    }
    boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int zwrocOdWartosciLogicznej(boolean czyZwrocic, int liczba3) {
        if(czyZwrocic) {
            return liczba3;
        } else {
            return 0;
        }
    }

}
