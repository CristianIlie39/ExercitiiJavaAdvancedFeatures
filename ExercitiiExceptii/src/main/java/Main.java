import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 13;
        int y = 0;

        try {
            System.out.println("Rezultatul impartirii lui x la y este: " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Incercati o operatie aritmetica imposibila: " + e.getMessage());
        }

        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println("Valoarea de pe pozitia 3 este: " + array[3]);
            System.out.println("Valoarea de pe pozitia 16 este: " + array[16]);
            System.out.println("Afisam rezultatul impartirii lui x la y: " + (x / y));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A aparut o exceptie specifica: " + e.getMessage());
        } catch (Exception exception) {
            System.out.println("A aparut o exceptie: " + exception.getMessage());
        }

        String text = "a";
        if (text == null) {
            throw new NullPointerException(("Ai uitat sa instantiezi textul"));
        }

        try {
            System.out.println("Lungimea textului este: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Aveti grija ca nu ati instantiat obiectul: " + e.getMessage());
        }

        String text1 = "Tratam exceptii";
        System.out.println("Caracterul de la pozitia 8 este: " + returneazaCaracter(text1));
        String text2 = "Tratam";

        try {
            System.out.println("Caracterul de la pozitia 8 este: " + returneazaCaracter(text2));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Stringul este mai mic decat pozitia cautata: " + e.getMessage());
        }

        //se introduce un numar de la tastatura
        //daca numarul este par, afisam un mesaj "Bravo! Ati ales un numar par!"
        //daca numarul este impar, aruncam exceptia OddNumberException

        try {
            numar();
        }catch (OddNumberException e) {
            System.out.println("Aveti grija ce numar introduceti: " + e.getMessage());
        }

        //punem utilizatorul sa introduca un cuvant
        //daca cuvantul incepe cu o vocala, aruncam exceptia si o prindem VowelException
        //daca incepe cu o consoana afisam mesajul "Totul este ok!"

        try {
            cuvant();
        }catch (VowelException e) {
            System.out.println("Apare o exceptie: " + e.getMessage());
        }


    }

    public static char returneazaCaracter(String text) {
        return text.charAt(8);
    }

    public static void numar() throws OddNumberException {
        System.out.println("Va rog sa introduceti un numar de la tastatura");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        System.out.println("Ati introdus numarul: " + numar);
        if (numar % 2 == 0) {
            System.out.println("Ati ales un numar par");
        } else {
            throw new OddNumberException("Ati ales un numar impar");
        }

    }

    public static void cuvant() throws VowelException {
        System.out.println("Va rog sa introduceti un cuvant de la tastatura");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Ati introdus cuvantul: ");
        if(text.startsWith("a") || text.startsWith("e") || text.startsWith("i") || text.startsWith("o") || text.startsWith("u")) {
            throw new VowelException("Cuvantul incepe cu o vocala");
        } else {
            System.out.println("Totul este ok!");
        }


    }



}
