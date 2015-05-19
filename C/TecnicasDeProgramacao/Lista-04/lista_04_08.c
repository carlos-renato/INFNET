#include <stdio.h>
#include <limits.h>


main() {
   int mat[3][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
   int i, j;

   	printf("Matriz 1\n");
	for (i = 0; i < 3; i++) {
		for (j = 0; j < 4; j++)
			printf("%3d", mat[i][j]);
		printf("\n");
	}
	printf("\nMatriz 2\n");
	for (i = 0; i < 4; i++) {
		for (j = 0; j < 3; j++)
			printf("%4d", mat[j][i]);
		printf("\n");
	}
	printf("\n");


}
