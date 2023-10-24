import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App2 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        long inicio = System.currentTimeMillis();

        int tamanho = 1000000;
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(1000));
        }

        int max = lista.get(0);
        for (int i = 1; i < tamanho; i++) {
            int valor = lista.get(i);
            if (valor > max) {
                max = valor;
            }
        }
        long fim = System.currentTimeMillis();
        double gasto = fim - inicio;
        System.out.println("Valor máximo encontrado: " + max);
        System.out.println("Tempo gasto: " + gasto + " milissegundos");
    }
}
