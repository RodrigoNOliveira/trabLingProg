#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int tamanho = 1000000;
    int lista[tamanho];
    int i, j;

    srand(time(NULL)); 
    
    for (i = 0; i < tamanho; i++) {
        lista[i] = rand() % 1000;
    }


    int max = lista[0];
    
    for (j = 1; j < tamanho; j++) {
        if (lista[j] > max) {
            max = lista[j];
        }
    }

    printf("Valor máximo encontrado: %d\n", max);
    return 0;
}
