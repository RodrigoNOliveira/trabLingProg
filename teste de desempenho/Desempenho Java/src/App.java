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
        long resultado = calcularSoma(1000000);  // Altere o valor de N conforme necessário
        long fim = System.currentTimeMillis();

        System.out.println("Resultado: " + resultado);
        System.out.println("Tempo gasto: " + (fim - inicio) + " milissegundos");
    }
}