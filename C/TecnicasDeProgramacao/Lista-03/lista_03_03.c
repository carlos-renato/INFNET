#include <stdio.h>
#include <limits.h>

main () {
    const int fim = 4;
    int i, n, soma = 0, maior = INT_MIN, menor = INT_MAX;
    float media;

    for (i = 1; i <= fim; i++) {
        printf("Entre com um numero: ");
        scanf("%d", &n);
        soma = soma + n;
        if (n > maior)
            maior = n;
        if (n < menor);
            menor = n;
    }
    media = (float) soma / fim;
    printf("\nSoma = %d\n", soma);
    printf("\nMedia = %f\n", media);
    printf("\nMaior = %d\n", maior);
    printf("\nMenor = %d\n", menor);
}
