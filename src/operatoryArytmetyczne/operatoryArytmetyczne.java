package operatoryArytmetyczne;

public class operatoryArytmetyczne {

    public static void main(String[] args) {

        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(3 * 5);
        System.out.println(2 / 2);
        System.out.println(10 % 4);

        double a = 9;
        double b = 2;

        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);
        double odejmowanie = a - b;
        System.out.println("Odejmowanie: " + odejmowanie);
        double mnozenie = a * b;
        System.out.println("Mnożenie: " + mnozenie);
        double dzielenie = a / b; // integer może zaokrąglić
        System.out.println("Dzielenie: " + dzielenie);
        double resztaZDzielenia = a % b;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);

        //jakby wszędzie był integer to by zaokrąglał

        a += b; // inaczej: a = a + b; // nadawanie nowej wartości
        System.out.println("a = a + b: " + a);
        a -= b; // inaczej: a = a - b
        System.out.println("a = a - b: " + a);
        a *= b; // inaczej a = a * b
        System.out.println("a = a * b: " + a);
        a /= b; //inaczej a = a / b
        System.out.println("a = a / b: " + a);
        a %= b; //inaczej a = a % b
        System.out.println("a = a % b: " + a);

        System.out.println("a: " + a + " b: " + b);
        b -= a; // inaczej b = b - a
        System.out.println("b = b - a: " + b); // KOLEJNOSC PISANYCH ZMIENNYCH LICZB MA ZNACZENIE

        a = a + 1;
        System.out.println ("a = a + 1: " + a);
        a += 1;
        System.out.println ("a = a += 1: " + a);

        //inkrementacja
        a++;
        System.out.println ("a = a++: " + a); // zwiększ wartość o jeden - inkrementacja

        //dekrementacja
        a--; // zmniejsz wartość o jeden - dekrementacja
        System.out.println("a--: " + a);

        // różnica jest taka, że dla wcześniejszych operacji najpierw jest brana wartość a,
        // a potem zwiększamy wartość o jeden. Tutaj najpierw następuje zwiększenie wartości a o 1 a dopiero później pobieramy wartość a.

        ++a;
        System.out.println("++a: " + a);
        --a;
        System.out.println("--a: " + a);




    }

}
