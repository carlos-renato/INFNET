#include <stdio.h>

const int TAM = 20;
const int FIM = 0;

main() {
	int i, num;
	int vet[20] = {0};

	printf("Entre com um numero entre 1 e 20: ");
	scanf("%d", &num);
	while (num != FIM) {
		if ((num >= 1) && (num <= 20))
			vet[num-1]++;
		else
			printf("ENTRADA INVALIDA!\n");
		printf("Entre com um numero de 1 e 20: ");
		scanf("%d", &num);
	}
	printf("\n");
	for (i = 0; i < TAM; i++)
        	printf("Numero de %ds = %dx\n", i+1, vet[i]);
	printf("\n");
}
