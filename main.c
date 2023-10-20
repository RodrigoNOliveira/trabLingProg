#include <stdio.h>
#include <stdlib.h>

//Nesse codigo é exemplificado conceitos de estrutura de controle (condicional e repetição), for e if

int main(int argc, char *argv[]) {
	
	int i;
	for (i=1; i<=50; i++){
		if(i%5 == 0){
			printf("O valor %d e multiplo de 5\n", i);
		}
	}
	
	return 0;
}
