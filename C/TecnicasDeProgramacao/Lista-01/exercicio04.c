#include <stdio.h>

main() {

    float conta, gorjeta;

    printf("\n\tEntre com valor da conta: ");
    scanf("%f", &conta);
    gorjeta = conta * 0.1;
    printf("\nValor da gorjeta = %.2f\n", gorjeta);
    conta = conta + gorjeta;
    printf("O valor final da conta e = %.2f\n", conta);

}
