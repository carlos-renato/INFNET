#include <stdio.h>
#include <limits.h>


main() {
    int mat[5][4] = {0};
    int i,j,indice = 0;

    for(i = 0; i < 4; i++){
        for(j = 0; j < 5; j++){
            mat[i][j] = indice;
            indice++;
        }
    }
    for(i = 0; i < 4; i++){
        for(j = 0; j < 5; j++){
            printf("%4d ", mat[i][j]);

        }
        printf("\n");
    }
}
