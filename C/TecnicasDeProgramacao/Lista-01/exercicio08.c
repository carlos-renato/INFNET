#include <stdio.h>
#include <math.h>

main () {

    float area, raio;

    printf("\n\t*****************\n");
    printf("\t*AREA DO CIRCULO*");
    printf("\n\t*****************\n");
    printf("\nInsira o raio: ");
    scanf("%f", &raio);

    area = M_PI * raio;

    printf("\nArea: %.2f\n", area);

}
