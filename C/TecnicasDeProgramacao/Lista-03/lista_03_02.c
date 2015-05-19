#include <stdio.h>

main () {

    int i = 1, soma = 0;

    for (i; i <= 100; i++) {

        soma = soma + i;
    }
    printf("A soma dos numeros de 1 a 100 eh: %d", soma);
}
