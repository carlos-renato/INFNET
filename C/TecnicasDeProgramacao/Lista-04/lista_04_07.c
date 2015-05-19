#include <stdio.h>
#include <limits.h>

    const int tam = 10;
main() {
    int vet[]={10,2,30,3,50,6,70,8,9,1};
    int i, menor = INT_MAX;

    for(i = 0; i < tam; i++){
        if (vet[i] < menor)
            menor = vet[i];
    }
    printf("Menor numero encontrado: %d\n", menor);
}
