#include <stdio.h>

const int TAM = 20;
const int FIM = 0;

main(){
    int vet[TAM];
    int num, cont = -1, i, soma = 0;

    printf("Entre com um numero: ");
    scanf("%d", &num);
    while ((num != FIM) && (cont < TAM-1)) {
        cont++;
		vet[cont] = num;
		if (cont < TAM-1) {
			printf("Entre com um numero: ");
			scanf("%d", &num);
		}
		else
			printf("Nao eh possivel entrar com mais de 20 numeros\n");
    }


    for(i = cont; i >= 0; i--){
        printf("%d ", vet[i]);
    }

    printf("\n");
}
