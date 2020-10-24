import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Operation {

    MyFileReader myFileReader = MyFileReader.getInstance();
    TvComparator tvComparator = new TvComparator();

    //aici fac metoda pt sortarea si afisarea din fisier a televizoarelor in ordinea descrescatoare a diagonalei
    public void displayTvByDiagonalSize(String filepath) throws IOException {
        System.out.println("Aici afisam televizoarele in ordinea descrescatoare a diagonalei");
        List<TV> tvList = MyFileReader.getInstance().readFile(filepath);
        Collections.sort(tvList, tvComparator.reversed());
        for (TV tv : tvList) {
            System.out.println(tv.toString());
        }
    }

}
