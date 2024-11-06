import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> randomList = Seed.getRnadomList(10, 1000, 0);
        BucketSort bucketSort = new BucketSort(randomList,5);
        bucketSort.sort();
        System.out.println(bucketSort.toString());
    }
}