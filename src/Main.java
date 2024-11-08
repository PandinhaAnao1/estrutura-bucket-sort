import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> randomList = Seed.getRnadomList(100000000, 100, 0);
        long tempoInicio = System.nanoTime();
        BucketSort bucketSort = new BucketSort(randomList);
        bucketSort.sort();
        long tempoFim = System.nanoTime();
        long tempoDecorrido = tempoFim - tempoInicio;
        double tempoDecorridoSegundos = tempoDecorrido / 1.0e9;
        System.out.println("Tempo gasto para ordenar: "+tempoDecorridoSegundos);
    }
}