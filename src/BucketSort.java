import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;


public class BucketSort {
    //Atributo que representa o tamanho indicado do bucket
    int lengthBuckets = 10;
    //Atributo que representa a quantidade de buckets
    int manyBucket;
    //Atributo que representa o valor minimo da lista
    int min;
    //Atributo que representa o valor maximo da lista
    int max;
    //Atributo que representa a lista de elementos para ser ordenados
    List<Integer> listaDeElementos;
    LinkedList<Bucket> linkedList = new LinkedList<Bucket>();


    //Existe duas possibilidade de contrutores


    //Construtor que recebe a lista de elementos e a quantidade de buckets
    public BucketSort(List<Integer> lista, int manyBucket) {
        this.listaDeElementos = lista;
        this.manyBucket = manyBucket;
        this.min = getMin(lista);
        this.max = getMax(lista);

        //Se eu sei a quantidade de buckets então eu posso calcular o tamanho de cada bucket
        if(manyBucket >= max){
            this.lengthBuckets = 1;
        }else{
            this.lengthBuckets = Math.round(((float) max /manyBucket));
        }

        //Não importa se a lista tem 2 elementos se um dele for 5000
        //Eu sou obrigado a criar 500 buckets para garantir que o elemento 5000 seja
        //alocado em algum bucket e os outro 498 buckets vão ficar vazios isso não
        //é importante para o algoritmo de ordenação

        createEmptyBuckets(manyBucket);

    }

    //Construtor que recebe a lista de elementos então calcula a quantidade de buckets
    public BucketSort(List<Integer>  lista) {
        this.listaDeElementos = lista;
        this.min = getMin(lista);
        this.max = getMax(lista);
        this.manyBucket = Math.round(((float)  max/lengthBuckets));
        createEmptyBuckets(manyBucket);

    }

    private  static int getMin(List<Integer> itens){
        int min = itens.getFirst();

        for (Integer iten : itens) {
            if (iten < min) {
                min = iten;
            }
        }
        return  min;
    }

    private  static int getMax(List<Integer> itens){
        int max = itens.getFirst();

        for (Integer iten : itens) {
            if (iten > max) {
                max = iten;
            }
        }
        return  max;
    }

    private void createEmptyBuckets(int manyBucket) {
        System.out.println(max);

        for (int i = 1; i <= manyBucket; i++) {
            linkedList.add(new Bucket(((lengthBuckets*i)-(lengthBuckets)),  ((lengthBuckets*i)-1)));

        }

    }

    j
    public void sort() {

        for (int i = 0; i < listaDeElementos.size(); i++) {
            System.out.println(listaDeElementos.get(i));
            for(Bucket bucket : linkedList){

                if(listaDeElementos.get(i) <= bucket.max){
                    bucket.add(listaDeElementos.get(i));
                    listaDeElementos.remove(i);
                    break;
                }
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Bucket bucket : linkedList) {
            sb.append("Bucket [min=").append(bucket.min)
                    .append(", max=").append(bucket.max).append(", elements=").append(bucket.lista).append("]\n");
        }
        return sb.toString();
    }
}