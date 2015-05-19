#include<stdio.h>

void checaNumero(int *a, int *b) {

    printf("Entre com o 1o numero: ");
    scanf("%d", &a);
    printf("Entre com o 2o numero: ");
    scanf("%d", &b);

    if (a > b) {
        printf("%d eh maior", a);
    }
    else {
        printf("%d eh menor.", b);
    }
}

main(){
    int a, b;
    checaNumero(a,b);
}
