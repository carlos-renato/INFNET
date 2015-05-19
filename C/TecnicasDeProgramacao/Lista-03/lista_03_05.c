#include <stdio.h>
#include <limits.h>
main () {


    int i = -1, num, soma = 0, maior = INT_MIN, menor = INT_MAX;
    float media;

    while (num != 0) {

        printf("Entre com um numero: ");
        scanf("%d", &num);
        if ((num < menor) && (num != 0)){
            menor = num;
        }
        if (num > maior) {
            maior = num;
        }
        soma = soma + num;
        i++;
    }

    printf("\nSoma: %d", soma);
    media = (float) soma/i;
    printf("\nMedia: %.2f", media);
    printf("\nMaior: %d", maior);
    printf("\nMenor: %d", menor);

}
