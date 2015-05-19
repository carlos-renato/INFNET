#include <stdio.h>
#include <string.h>

main(){

    char palavra[10];
    char palavrain[10];
    int i = 0;
    printf("Entre com uma palavra: ");
    scanf("%s", &palavra);

    strcpy(palavrain,palavra);
    strrev(palavrain);
    printf("\n");
    puts(palavra);
    puts(palavrain);
    printf("\n");

    if (strcmp(palavra, palavrain) == 0){
        printf("Palindrome!!!\n");
    }
    else {
        printf("Nao eh palilndrome\n`");
    }

}
