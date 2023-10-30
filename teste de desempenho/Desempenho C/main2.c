#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    clock_t inicio = clock();
    int tamanho = 10000000;
    int *lista;
    int i, j;
    srand(time(NULL));

    lista = malloc(tamanho * sizeof(int));
    if (lista == NULL)
    {
        printf("Erro ao alocar memória.\n");
        return 1;
    }

    for (i = 0; i < tamanho; i++)
    {
        lista[i] = rand() % 5000;
    }

    int max = lista[0];

    for (j = 1; j < tamanho; j++)
    {
        if (lista[j] > max)
        {
            max = lista[j];
        }
    }
    clock_t fim = clock();
    double tempo = (double)(fim - inicio) / CLOCKS_PER_SEC;
    printf("Valor máximo encontrado: %d\n", max);
    printf("Tempo decorrido: %.6f segundos\n", tempo);
    free(lista);
    return 0;
}
