#include <stdio.h>

    const int tam = 10;
main() {
    int vet[]={10,20,30,40,50,60,70,80,90,100};
    int num, i, indice = 0, achou = 0;

    printf("Entre com um numero: ");
    scanf("%d", &num);

    do {
        if (vet[indice] == num)
            achou = 1;
        else
            indice++;
    } while ((!achou) && (indice < tam));

    if (achou)
        printf("Numero encontrado.\n");
    else
        printf("Numero nao encontrado.\n");

}
