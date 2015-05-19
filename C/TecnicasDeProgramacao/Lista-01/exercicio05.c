#include <stdio.h>

main(){

    int salInicial;
    float salFinal, r;

    printf("\n\tCalculo de Salario");
    printf("\nInsira o salario: ");
    scanf("%d", &salInicial);
    printf("\nInsira o valor do reajuste: ");
    scanf("%f", &r);

    salFinal = (float) (salInicial * r)/100 + salInicial;
    printf("\nNovo salario: R$%.2f\n", salFinal);

}
