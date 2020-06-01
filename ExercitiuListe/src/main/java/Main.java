import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    //Sa se citeasca dintr-un fisier
    //Pe primul rand avem un sir de numere separate prin ;
    //Sa se ordoneze numerele
    //Sa se caute numarul 325
    //Sa se afiseze in ordinea inversa
    //Sa se afiseze cel mai mare numar
    //Sa se afiseze cel mai mic numar
    //Sa se afiseze lista de numere fara duplicate

    public static void main(String[] args) {



        try {
            String filePath = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\ExercitiuListe\\FisierNumere.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //Citim primul rand dintr-un fisier
            String text = bufferedReader.readLine();

            String[] arrayNumbers = text.split(";");
            List<Integer> numbers = new ArrayList<Integer>();
            for (int cursor = 0; cursor < arrayNumbers.length; cursor++) {
                numbers.add(Integer.valueOf(arrayNumbers[cursor]));
            }

            System.out.println("Afisam lista de numere");
            for (Integer number : numbers) {
                System.out.println(number);
            }

            //Ordonam lista de numere crescator
            System.out.println("Lista de numere ordonata crescator este:");
            Collections.sort(numbers);
            for (Integer number : numbers) {
                System.out.println(number);
            }

            //Cautam numarul 325 si il afisam
            int result = Collections.binarySearch(numbers, 325);
            System.out.println("Afisam indexul numarului 325: " + result);

            //Afisam lista de numere ordonate descrescator
            Collections.reverse(numbers);
            System.out.println("Afisam lista de numere ordonate descrescator");
            for (Integer number : numbers) {
                System.out.println(number);
            }

            //Afisam cel mai mare numar
            int result1 = Collections.max(numbers);
            System.out.println("Cel mai mare numar este: " + result1);

            //Afisam cel mai mic numar
            int result2 = Collections.min(numbers);
            System.out.println("Cel mai mic numar este: " + result2);

            //declaram un set in care introducem numerele din lista si apoi afisam numerele din set
            Set<Integer> setNumbers = new HashSet<Integer>();
            for (Integer number: numbers) {
                setNumbers.add(number);
            }
            System.out.println("Lista de numere fara duplicate este");
            for (Integer number : setNumbers) {
                System.out.println(number);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit " + e.getMessage());
        }catch (IOException e) {
            System.out.println("A aparut o eroare " + e.getMessage());
        }




    }

}
