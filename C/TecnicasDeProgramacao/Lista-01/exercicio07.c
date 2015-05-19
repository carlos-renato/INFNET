#include <stdio.h>

main () {

    float b, h, area;

    printf("\n\t*******************\n");
    printf("\t*AREA DO RETANGULO*");
    printf("\n\t*******************\n");
    printf("\nInsira a base: ");
    scanf("%f", &b);
    printf("Insira a altura :");
    scanf("%f", &h);

    area = b * h;
    printf("Area: %.2f", area);
}
