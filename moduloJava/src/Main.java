import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Integer> numerosPrimos = new ArrayList<>() {};

        for (int i = 2; i <= 10000; i++) {
            boolean isPrimo = true;
            for (int j = 0; j < numerosPrimos.size(); j++ ) {
                if (i % numerosPrimos.get(j) == 0) {
                    isPrimo = false;
                }
            }
            if (isPrimo) {
                numerosPrimos.add(i);
            }
        }

        System.out.println(numerosPrimos);
        System.out.println(numerosPrimos.size());

    }
}
