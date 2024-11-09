import java.util.ArrayList;
import  java.util.List;
import  java.lang.Integer;

public class Bucket {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    int min;
    int max;

    public Bucket(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void add(int value) {
            lista.add(value);
    }
}