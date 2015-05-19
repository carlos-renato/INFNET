#include <stdio.h>
#include <string.h>

const int tam = 20;

main(){
    char frase[tam];
    int i, j;

    puts("Digite sua frase abaixo: ");
    gets(frase);
    printf("\n%d\n",strlen(frase));
    j = strlen(frase);
    for(i = j; i >= 0; i--){
        printf("%c", frase[i]);
    }

}
