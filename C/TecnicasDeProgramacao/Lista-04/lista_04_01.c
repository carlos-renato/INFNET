#include <stdio.h>

main() {

    int veta[] = {10,20,30,40,50,60,70,80}, vetb[8], i = 0, tam = 8;

    for (i; i <= tam; i++) {
        vetb[i] = veta[(tam - i)-1];
    }
    printf("Vetor A: ");

    for(i = 0; i < tam; i++) {
        printf("%d ",veta[i]);
    }
    printf("\n");
    printf("Vetor B: ");

    for(i = 0; i < tam; i++) {
        printf("%d ",vetb[i]);
    }
}
