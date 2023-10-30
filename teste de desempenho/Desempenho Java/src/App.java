public class App {
    public static long calcularSoma(int n) {
        long total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        long resultado = calcularSoma(10000000);  
        long fim = System.currentTimeMillis();
        double tempo = fim - inicio;

        System.out.println("Resultado: " + resultado);
        System.out.printf("Tempo gasto: %f segundos", tempo/1000);
    }
}