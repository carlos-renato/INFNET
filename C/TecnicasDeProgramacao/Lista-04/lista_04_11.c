#include <stdio.h>
#include <limits.h>

const int nl = 6;
const int nc = 3;

main() {
    int mat[6][3] = {{5,7,4},{5,6,7},{3,5,2},{4,5,6},{8,9,7},{2,6,4}};
    int i, j;
    float media, mediat;

    for(i = 0; i < nl; i++){
        media = 0;
        for(j = 0; j < nc; j++){
            media += mat[i][j];
         }
        media += media / nc;
        mediat += media;
        printf("Media do aluno %d: %.2d", i+1, media);
        printf("\n");
    }
    mediat += mediat/nl;
    printf("\nMedia da turma: %.2d\n", mediat);
}
