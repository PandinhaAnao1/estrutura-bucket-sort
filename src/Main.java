import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = Seed.getRnadomList(100000 , 100, 0);
        long tempoInicioLista = System.nanoTime();

        // Ordena a lista usando Collections.sort()
        Collections.sort(randomList);

        // Captura o tempo após a ordenação
        long tempoFimLista = System.nanoTime();

        // Calcula o tempo decorrido em nanossegundos
        long tempoDecorridoLista = tempoFimLista - tempoInicioLista;

        // Converte para segundos
        double tempoDecorridoSegundosLISTA = tempoDecorridoLista / 1.0e9;

        // Exibe o tempo decorrido em segundos

        long tempoInicio = System.nanoTime();
        ArrayList<Integer> listaOrdenada;
        BucketSort bucketSort = new BucketSort(randomList);
        listaOrdenada = bucketSort.sort();
        long tempoFim = System.nanoTime();
        long tempoDecorrido = tempoFim - tempoInicio;
        double tempoDecorridoSegundos = tempoDecorrido / 1.0e9;
        System.out.printf("Tempo de ordenação: %.4f segundos na lista\n", tempoDecorridoSegundosLISTA);
        System.out.println("Tempo gasto para ordenar no bucket: "+tempoDecorridoSegundos);
        System.out.println(bucketSort);

    }
}