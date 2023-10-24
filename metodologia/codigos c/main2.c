#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Neste exemplo foi utilizado unidades de programa(char (sendo usado como string), int e double) e o uso de um procedimento

void mensagem(char n[50], int i, double t){
  printf("Seu nome é %s, você tem %d anos e mede %.2lf\n", n, i, t);

}




int main(int argc, char *argv[]) {
	
	setlocale(LC_ALL, "");
	
	int idade;
	char nome[50];
	double tamanho;
	
	printf("Insira seu nome: ");
	scanf("%s", &nome);
	printf("\nInsira sua idade: ");
	scanf("%d", &idade);
	printf("\nInsira seu tamanho: ");
	scanf("%lf", &tamanho);	
	
	mensagem(nome, idade, tamanho);
	
	
	
	return 0;
}
