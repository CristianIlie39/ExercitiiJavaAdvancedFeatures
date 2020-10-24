import java.io.IOException;

public class Main {

    /*
        Intr-un fisier pe fiecare rand exista cate un televizor in formatul de mai jos; in fisier avem cel putin 10 randuri.
            - marca
            - model
            - diagonala
        Sa se citeasca televizoarele din fisier si sa se afiseze in ordinea descrescatoare a diagonalei.
     */

    public static void main(String[] args) {

        MyFileReader myFileReader = MyFileReader.getInstance();
        Operation operation = new Operation();

        String filepath = "D:\\cursuri Alex\\RECAPITULARE\\24.10.2020\\FisierDeCitit.txt";
        try {
            myFileReader.displayTV(filepath);
            operation.displayTvByDiagonalSize(filepath);
        } catch (IOException exception) {
            System.out.println("A aparut o eroare " + exception.getMessage());
        }

    }
}
