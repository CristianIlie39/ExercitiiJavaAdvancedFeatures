import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader {

    private static MyFileReader instance = new MyFileReader();


    private MyFileReader() {

    }

    public static MyFileReader getInstance() {
        return instance;
    }

    //aici fac metoda pt citire televizoare din fisier
    public List<TV> readFile(String filepath) throws IOException {
        List<TV> tvList = new ArrayList<>();
        FileReader fileReader = new FileReader(filepath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text = bufferedReader.readLine();
        while (text != null && !text.isEmpty()) {
            String[] arrayWords = text.split(" ");
            TV tv = new TV(arrayWords[0], arrayWords[1], Integer.valueOf(arrayWords[2]));
            tvList.add(tv);
            text = bufferedReader.readLine();
        }
        return tvList;
    }

    //aici fac metoda pt afisare televizoare din fisier
    public void displayTV(String filepath) throws IOException {
        System.out.println("Aici afisam televizoarele din fisier");
        for (TV tv : readFile(filepath)) {
            System.out.println(tv.toString());
        }
    }

}
