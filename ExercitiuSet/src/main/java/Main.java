import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    //Sa se citeasca dintr-un fisier informatii despre angajatii unei companii
    //Pe fiecare rand vor fi separate prin virgula nume, prenume, departament -> 2 departamente: IT si vanzari
    //Dupa ce i-am citit ii punem in 2 seturi separate: unul care sa-i contina pe cei de la IT si unul care sa-i contina pe cei de la vanzari
    //afisam cele 2 seturi

    public static void main(String[] args) {

        //Creem 2 seturi de angajati
        Set<Employee> itSet = new HashSet<Employee>();
        Set<Employee> saleSet = new HashSet<Employee>();

        try {
            String filePath = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\ExercitiuSet\\EmployeeFile.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Afisam lista de angajati:");
            String text = bufferedReader.readLine();
            while (text !=null) {
                System.out.println(text);
                String[] arrayWords = text.split(",");
                Employee employee = new Employee(arrayWords[0], arrayWords[1], arrayWords[2]);
                if (employee.getDepartment().equals("IT")) {
                    itSet.add(employee);
                } else if (employee.getDepartment().equals("Vanzari")) {
                    saleSet.add(employee);
                }

                text = bufferedReader.readLine();
            }

            System.out.println("Afisam lista angajatilor din departamentul IT");
            for (Employee employee: itSet) {
                System.out.println(employee);
            }

            System.out.println("Afisam lista angajatilor din departamentul Vanzari");
            for (Employee employee: saleSet) {
                System.out.println(employee);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Fisierul nu este gasit" + e.getMessage());
        }catch (IOException e) {
            System.out.println("A aparut o exceptie: " + e.getMessage());
        }

    }


}
