#include <stdio.h>

main () {
    int i, n, primo = 1;

    printf("Entre com um numero: ");
    scanf("%d", &n);

    for (i = 2; i < n; i++) {
        if ((n % i) == 0)
            primo = 0;
    }
    if (primo)
        printf("\nNumero %d eh primo\n", n);
    else
        printf("\nNumero %d nao eh primo\n", n);

}
