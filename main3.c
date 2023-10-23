#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");

    int x = 10;
    int y = 5;

    //Neste exemplo foi utilizado comandos que atribui o resultado da soma de x e y à variável z
    
    int z = x + y;

    printf("O valor de z é: %d\n", z);

    return 0;
}