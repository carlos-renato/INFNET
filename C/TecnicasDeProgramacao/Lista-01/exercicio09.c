#include <stdio.h>
#include <math.h>

main () {

    float raio, area;

    printf("\n\t****************\n");
    printf("\t*AREA DA ESFERA*");
    printf("\n\t****************\n");

    printf("\nInsira o comprimento do raio: ");
    scanf("%f", &raio);

    area = (4 * M_PI) * (raio * raio);

    printf("Area: %.2f", area);
}
