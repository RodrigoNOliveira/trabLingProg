#include <stdio.h>
#include <time.h>

long long calcularSoma(int n) {
    long long total = 0;
    int i;
    for (i = 1; i <= n; i++) {
        total += i;
    }
    return total;
}

int main() {
    clock_t inicio = clock();
    long long resultado = calcularSoma(10000000);
    clock_t fim = clock();

    double tempo = (double)(fim - inicio) / CLOCKS_PER_SEC;

    printf("Resultado: %lld\n", resultado);
    printf("Tempo decorrido: %.6f segundos\n", tempo);
    return 0;
}
