#include<stdio.h>

void checaNumero() {

    int num;
    printf("\nEntre com o numero: ");
    scanf("%d", &num);

    if (num == 0) {
        printf("NULO!!!");
    }
    else {
        if (num % 2 == 0){
            printf("Par.");
        }else {
            printf("Impar.");
        }
    }
}

main(){

    checaNumero();
}
