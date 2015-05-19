#include<stdio.h>

void checaNumero(int *pNum) {

    printf("\nEntre com o numero: ");
    scanf("%d", &pNum);

    if (pNum > 0) {
        printf("Maior que zero.");
    }
    else {
        if (pNum < 0){
            printf("Menor que zero.");
        }
        else{
            printf("NULO!!!");
        }
    }
}

main(){

    int num;
    checaNumero(num);
}
