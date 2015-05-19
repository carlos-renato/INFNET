#include <stdio.h>
#include <string.h>

const char tam = 20;

main(){
  char frase[tam];
  int fim, j;
  int a = 0, e = 0, i = 0, o = 0, u = 0;

  printf("Entre com uma frase: ");
  gets(frase);

  fim = strlen(frase);

    for(j = 0; j < fim; j++){
        switch (frase[j]){
            case 'a':
            a++;
            break;
            case 'e':
            e++;
            break;
            case 'i':
            i++;
            break;
            case 'o':
            o++;
            break;
            case 'u':
            u++;
            break;
        }
    }

    printf("\nA: %d", a);
    printf("\nE: %d", e);
    printf("\nI: %d", i);
    printf("\nO: %d", o);
    printf("\nU: %d", u);
    printf("\n");
}
