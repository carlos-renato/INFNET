#include <stdio.h>
#include <math.h>

main () {

    float raio, altura, area;

    printf("\n\t***********************************\n");
    printf("\t*VOLUME DA CAIXA D'AGUA CILINDRICA*");
    printf("\n\t***********************************\n");

    printf("\nInsira o raio: ");
    scanf("%f", &raio);
    printf("\nInsira a altura: ");
    scanf("%f", &altura);

    area = M_PI * raio * raio * altura;

    printf("\nArea: %.2f\n", area);
}
