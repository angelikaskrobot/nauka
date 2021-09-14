public class InstrukcjeWarunkoweZadania {
    public static void main(String[] args) {

        //zadanie 1

        double liczba = 5;
        double wynik2 = liczba / 2;
        System.out.println("Wynik dzielenia przez 2 to " + wynik2);
        if(liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        //zadanie 2

        double kwota = -2;

        if (kwota < 0) {
            System.out.println("Podatek do zapłaty wynosi 0 zł");
        } else if(kwota <= 85528) {
            double podatek = kwota * 0.17;
            System.out.println("Podatek do zaplaty wynosi: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (kwota - 85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek już większy do zapłaty wynosi: " + podatek);
        }

        //zadanie 3

        double a = 12;
        double b = 0;
        if(b == 0){
            System.out.println("Nie dzieli się przez 0");
            System.exit(0);
        }
        double wynik = 0;
        char rodzajDzialania = '-';
        switch(rodzajDzialania) {
            case '+': wynik = a+b;
            break;
            case '-': wynik = a-b;
            break;
            case '*': wynik = a*b;
            break;
            case '/': wynik = a/b;
            break;
            case '%': wynik = a%b;
            break;
        }
        if (wynik == (int) wynik) {
            System.out.println("Wynik działania to " + (int) wynik);
        } else {
            System.out.println("Wynik działania to " + wynik);
        }
        }
    }

