import java.io.*;

public class Main {

    public static void main(String[] args) {

        //Sa se citeasca dintr-un fisier linie cu linie
        //Sa se scrie in alt fisier liniile din primul fisier care au numar par de cuvinte

        try {
            String filePathToRead = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\Exercitiu2CitireScriereFisiere\\TextDeCitit.txt";
            String filePathToWrite = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\Exercitiu2CitireScriereFisiere\\TextDeScris.txt";

            FileReader fileReader = new FileReader(filePathToRead);
            FileWriter fileWriter = new FileWriter(filePathToWrite);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String text = bufferedReader.readLine();

            while (text != null) {
                String[] arrayWord = text.split(" ");
                if (arrayWord.length % 2 == 0) {
                    bufferedWriter.write(text);
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                text = bufferedReader.readLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("A aparut o eroare: " + e.getMessage());
        }


    }

}
