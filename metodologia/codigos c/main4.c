#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ponteiro;

    // Neste exemplo fazemos uma alocação de memoria, onde o codigo aloca memória para armazenar um inteiro
    ponteiro = (int *)malloc(sizeof(int));

    if (ponteiro == NULL) {
        printf("Falha na alocação de memória.\n");
        return 1;
    }

    *ponteiro = 42;
    printf("O valor apontado por 'ponteiro' é: %d\n", *ponteiro);

    // Libera a memória alocada
    free(ponteiro);

    return 0;
}