#include <stdio.h>

main () {
    int i = 0, n, primo = 1;

    printf("Entre com um numero: ");
    scanf("%d", &n);

    while ((primo) && (i < n)) { //while((primo) && (i < sqrt(n)))
        if ((n % i) == 0)
            primo = 0;
        else
            i++;
    }
    if (primo)
        printf("\nNumero %d eh primo\n", n);
    else
        printf("\nNumero %d nao eh primo\n", n);

}
