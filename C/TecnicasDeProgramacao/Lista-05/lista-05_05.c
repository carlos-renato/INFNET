#include <stdio.h>
#include <string.h>

const int tam = 30;

main(){

    char nomecompleto[tam];
    char sobrenome[10];
    int i, j = 0;

    printf("Entre com seu nome e sobrenome: ");
    gets(nomecompleto);
    i = strlen(nomecompleto);
    i--;
    printf("\nSobrenome: ");

    while((i >= 0 ) && (nomecompleto[i] != ' ')) {
        i--;
    }
    while (nomecompleto[i++] != '\0'){
        sobrenome[j] = nomecompleto[i];
        j++;
    }
    puts(sobrenome);
}
