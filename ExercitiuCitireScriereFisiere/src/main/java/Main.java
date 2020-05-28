import java.io.*;

public class Main {

    public static void main(String[] args) {

        //Sa se citeasca fiecare rand dintr-un fisier.
        //Sa se afiseze numarul de cuvinte dintr-un rand.
        //Sa se scrie randuri intr-un fisier.


        try {
            //Declaram calea catre fisierul de citit, urmata de numele fisierului + extensia/tipul fisierului
            String filePath = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\ExercitiuCitireScriereFisiere\\FisierDeCitit.txt";

            //Incarcam fisierul de citit in programul nostru
            //Se face cu ajutorul obiectului FileReader
            FileReader fileReader = new FileReader(filePath);

            //Incepem citirea din fisierul de citit
            //Obiectul folosit pentru a citi linie cu linie se numeste BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //Citim prima linie
            String text = bufferedReader.readLine();
            //daca nu pui intr-un while nu o sa-ti citeasca tot fisierul
            while (text != null) {
                System.out.println("Linia citita este: " + text);
                String[] arrayWord = text.split(" ");
                System.out.println("Linia citita are " + arrayWord.length + " cuvinte.");
                text = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("A aparut o eroare: " + e.getMessage());
        }


        //aici incepem sa scriem intr-un fisier

        try {
            //declaram calea catre fisierul in care scriem
            String filePathToWrite = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\ExercitiuCitireScriereFisiere\\FisierDeScris.txt";

            //incarcam in program fisierul de scris
            //se face cu ajutorul obiectului FileWriter
            FileWriter fileWriter = new FileWriter(filePathToWrite);

            //incepem sa scriem in fisier
            //se face cu ajutorul obiectului BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String textDeScris = "Afara e timp frumos.";
            String textDeScris1 = "Mergem sa ne plimbam.";
            bufferedWriter.write(textDeScris);
            bufferedWriter.newLine(); //se trece la scrierea unei noi linii
            bufferedWriter.write(textDeScris1);
            bufferedWriter.flush(); //este un fel de marcare/salvare a textului scris in fisier
            bufferedWriter.close(); //este un fel de incheiere a textului scris
        }catch (IOException e) {
            System.out.println("A aparut o eroare: " + e.getMessage());
        }

    }


}
