import java.util.ArrayList;
import java.util.List;

// VAMOS A AÑADIR DESDE LA WEB NUEVAS LINEAS DE CODIGO

public class Main {
    static void main(String[] args) {
        List<Integer> MilistadePrimos = new ArrayList<>() {};

        List<Integer> MilistadeNoPrimos = new ArrayList<>() {};

        for (int i = 2; i <= 3000; i++) {
            boolean isPrimo = true;
            for (int j = 0; j < MilistadePrimos.size(); j++ ) {
                if (i % MilistadePrimos.get(j) == 0) {
                    isPrimo = false;
                }
            }
            if (isPrimo) {
                MilistadePrimos.add(i);
                MilistadePrimos.getFirst();
            } else{
                MilistadeNoprimos.add(i);
            }
        }

        System.out.println(MilistadePrimos);
        
        System.out.println(MilistadePrimos.get(1));


    }
}
