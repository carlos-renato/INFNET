#include <stdio.h>

main() {

    float lado, area;

    printf("\n\t******************\n");
    printf("\t*AREA DO QUADRADO*");
    printf("\n\t******************\n");
    printf("\nQual e o tamanho do lado? ");
    scanf("%f", &lado);

    area = (float) lado * lado;

    printf("\nArea: %.2f\n", area);
}
