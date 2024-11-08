import java.lang.Integer;
import java.util.*;

public class Seed {

    public  static ArrayList<Integer> getRnadomList(int count, int max, int min){
        ArrayList<Integer> listaDeNumeroAleatorios = new ArrayList<Integer> ();
        Random random = new Random();
        for(int i = 0; i < count; i++ ){
            listaDeNumeroAleatorios.add(random.nextInt(max - min) + min);
        }
        return listaDeNumeroAleatorios;
    }
}