import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Sa se citeasca dintr-n fisier de pe fiecare rand numele, prenumele, clasa (10, 11 si 12) si un optional (ca materie: Informatica, Germana, MatematicaAplicata)
    //Sa se grupeze in colectii diferite elevii in functie de clasa din care fac parte si in functie de optionalul la care participa (fara sa punem IF sau FOR)
    //Atributele vor fi separate prin ;
    //Afisam toti tudentii de la informatica
    //Afisam toti studentii din clasa a 11-a
    //Afisam toti studentii de la Matematica Aplicata
    //Afisam toti studentii din clasa a 10-a

    public static void main(String[] args) {

        try {
            String filePath = "D:\\RepositoryCursGalati3\\ExercitiiJavaAdvancedFeatures\\ExercitiuMap\\StudentsFile.txt";
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();

            //creem 2 Map-uri
            Map<String, ArrayList<Student>> groupsMap = new HashMap<String, ArrayList<Student>>();
            Map<String, ArrayList<Student>> optionalsMap = new HashMap<String, ArrayList<Student>>();

            //pregatim map-urile in functie de chei (clasele si optionalele) ---> separat pe fiecare clasa, cu un Array gol in care vom adauga studentii
            groupsMap.put("10", new ArrayList<Student>());
            groupsMap.put("11", new ArrayList<Student>());
            groupsMap.put("12", new ArrayList<Student>());

            optionalsMap.put("Informatica", new ArrayList<Student>());
            optionalsMap.put("Germana", new ArrayList<Student>());
            optionalsMap.put("MatematicaAplicata", new ArrayList<Student>());

            //le filtram in while
            while (text != null) {
                String[] arrayWords = text.split(";");
                Student student = new Student(arrayWords[0], arrayWords[1], arrayWords[2], arrayWords[3]);

                if (student.getGroup().equals("10")) {
                    groupsMap.get("10").add(student);
                } else if (student.getGroup().equals("11")) {
                    groupsMap.get("11").add(student);
                } else if (student.getGroup().equals("12")) {
                    groupsMap.get("12").add(student);
                }

                if (student.getOptional().equals("Informatica")) {
                    optionalsMap.get("Informatica").add(student);
                } else if (student.getOptional().equals("Germana")) {
                    optionalsMap.get("Germana").add(student);
                } else if (student.getOptional().equals("MatematicaAplicata")) {
                    optionalsMap.get("MatematicaAplicata").add(student);
                }

                text = bufferedReader.readLine();
            }

            //Afisam toti studentii de la Informatica
            System.out.println("Afisam studentii de la Informatica");
            ArrayList<Student> studentsInformatica = optionalsMap.get("Informatica");
            for (Student student : studentsInformatica) {
                System.out.println(student);
            }

            //Afisam toti studentii din clasa a 11-a
            System.out.println("Afisam studentii din clasa a 11-a");
            ArrayList<Student> studentsGroup11 = groupsMap.get("11");
            for (Student student : studentsGroup11) {
                System.out.println(student);
            }

            //Afisam toti studentii de la Matematica Aplicata
            System.out.println("Afisam studentii de la MatematicaAplicata");
            ArrayList<Student> studentsMatematicaAplicata = optionalsMap.get("MatematicaAplicata");
            for (Student student : studentsMatematicaAplicata) {
                System.out.println(student);
            }

            //Afisam toti studentii din clasa a 10-a
            System.out.println("Afisam studentii din clasa a 10-a");
            ArrayList<Student> studentsGroup10 = groupsMap.get("10");
            for (Student student : studentsGroup10) {
                System.out.println(student);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu este gasit : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("A aparut o eroare: " + e.getMessage());
        }


    }


}
