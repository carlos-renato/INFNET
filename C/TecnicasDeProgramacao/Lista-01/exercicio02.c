#include <stdio.h>

main() {

    int n1, n2;
    float media;

    printf("Entre com a NOTA 1: ");
    scanf("%d", &n1);
    printf("Entre com a NOTA 2: ");
    scanf("%d", &n2);

    media = (float) (n1 + n2) / 2; //Casting: conversação implicita de tipos
    printf("\nMedia = %f\n", media);
}
