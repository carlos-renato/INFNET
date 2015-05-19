#include <stdio.h>
#include <string.h>

main(){

    char nomecompleto[30];
    char nome[10];
    char sobrenome[10];

    int i, j = 0;

    printf("Entre com seu nome e sobrenome: ");
    gets(nomecompleto);

    while (nomecompleto[i] != ' '){
        nome[i] = nomecompleto[i];
        i++;
    }
    printf("%s", nome);
}
