#include <stdio.h>

const int TAM = 20;
const int FIM = 0;

main(){
    int vet[TAM];
    int num, cont = -1, i, soma = 0;
    float media;

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
			printf("Erro: tamanho maximo do vetor\n");
    }
    for (i = 0; i <= cont; i++){
        soma += vet[i];
    }

    media = (float) soma/cont;
    printf("\nMedia: %.2f\n", media);
    printf("Maiores que a media: ");

    for(i = 0; i <= cont; i++){
        if (vet[i] >= media)
            printf("%d ", vet[i]);
    }

    printf("\n");
}
