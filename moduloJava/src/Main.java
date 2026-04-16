import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> MilistadePrimos = new ArrayList<>() {};

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
            }
        }

        System.out.println(MilistadePrimos);


    }
}
