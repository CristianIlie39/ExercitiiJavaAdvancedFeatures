import java.util.Comparator;

public class TvComparator implements Comparator<TV> {

    @Override
    public int compare(TV tv1, TV tv2) {
        return (tv1.getDiagonal() - tv2.getDiagonal());
    }
}
