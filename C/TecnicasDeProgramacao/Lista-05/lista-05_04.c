#include <stdio.h>
#include <String.h>


const int tam = 30;

main(){

    char nome1[tam];
    int j = 0;

    printf("Entre com seu nome e sobrenome (nome sobrenome): " );
    gets(nome1);
    puts(nome1);

    printf("\nSeu primeiro nome e ");

    for(j; j < tam; j++){
        if (nome1[j] != ' ')
            printf("%c", nome1[j]);
        else
            break;
    }
    printf("\n");

}
