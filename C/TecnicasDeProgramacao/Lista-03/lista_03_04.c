#include <stdio.h>
#include <limits.h>
main () {

    const int r = 20;
    int i = 1, num, soma = 0, maior = INT_MIN, menor = INT_MAX;
    float media;

    for (i; i <= r; i++) {

        printf("Entre com um numero: ");
        scanf("%d", &num);
        if (num < menor) {
            menor = num;
        }
        if (num > maior) {
            maior = num;
        }
        soma = soma + num;
    }

    printf("\nSoma: %d", soma);
    media = (float) soma/r;
    printf("\nMedia: %.2f", media);
    printf("\nMaior: %d", maior);
    printf("\nMenor: %d", menor);

}
