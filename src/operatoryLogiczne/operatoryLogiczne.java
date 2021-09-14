package operatoryLogiczne;

public class operatoryLogiczne {

    public static void main(String[] args) {

        // operatory logiczne true albo false

        int wiek = 20;

        // koniunkcja (AND)

        System.out.println(wiek >= 18 && wiek < 30);
        System.out.println(wiek > 30 && wiek < 40);

        // alternatywa (OR)

        System.out.println(wiek < 18 || wiek > 65);

        // negacja

        boolean prawda = true;
        System.out.println("!prawda: " + !prawda);

    }

}
