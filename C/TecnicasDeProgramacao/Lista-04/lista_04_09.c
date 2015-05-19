#include <stdio.h>
#include <limits.h>


main() {
    int mat1[2][2] = {{1,2},{3,4}};
    int mat2[2][2] = {{10,20},{30,40}};
    int matsoma[2][2] = {0};
    int i,j;

    printf("Matriz 1\n\n");
    for(i = 0; i < 2; i++){
        for(j = 0; j < 2; j++){
            printf("%4d", mat1[i][j]);
        }
        printf("\n");
    }
      printf("\nMatriz 2\n\n");
    for(i = 0; i < 2; i++){
        for(j = 0; j < 2; j++){
            printf("%4d", mat2[i][j]);
        }
        printf("\n");
    }

    for(i = 0; i < 2; i++){
        for(j = 0; j < 2; j++){
            matsoma[i][j] = mat1[i][j] + mat2[i][j];
        }
    }
      printf("\nMatriz Soma\n\n");
    for(i = 0; i < 2; i++){
        for(j = 0; j < 2; j++){
            printf("%4d", matsoma[i][j]);
        }
        printf("\n");
    }
}
