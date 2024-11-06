import java.lang.Integer;
import java.util.*;

public class Seed {

    public  static List<Integer> getRnadomList(int count, int max, int min){
        List<Integer> listaDeNumeroAleatorios = new LinkedList<Integer> ();
        Random random = new Random();
        for(int i = 0; i < count; i++ ){
            listaDeNumeroAleatorios.add(random.nextInt(max - min) + min);
        }
        return listaDeNumeroAleatorios;
    }
}