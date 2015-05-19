#include <stdio.h>

main() {

    int vet1[] = {1,2,3,4,5,6,7,8};
    int vet2[] = {10,20,30,40,50,60,70,80};
    int vet3[8];
    int i = 0, tam = 8;

    for (i; i < tam; i++) {

        vet3[i] = vet1[i] + vet2[i];
    }

    printf("Vetor 1: ");
    for(i = 0; i < tam; i++) {
        printf("%d ", vet1[i]);
    }
    printf("\n");

    printf("Vetor 2: ");
    for(i = 0; i < tam; i++) {
        printf("%d ", vet2[i]);
    }
    printf("\n");

    printf("Vetor 3: ");
    for(i = 0; i < tam; i++) {
        printf("%d ", vet3[i]);
    }



}
