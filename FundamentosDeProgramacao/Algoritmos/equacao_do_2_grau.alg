algoritmo "C�lculo de Equa��o de 2 Grau Completa"
// Fun��o :
// Autor :
// Data : 26/08/2014
// Se��o de Declara��es 
var
a, b, c, d, x1, x2 : real
inicio
// Se��o de Comandos

escreval ("Algor�timo para calcular uma Equa��o do 2 Grau")
escreval ("Insira o valor de A")
leia (a)
escreval ("Insira o valor de B")
leia (b)
escreval ("Insira o valor de C")
leia (c)

d <- (b*b)-(4*a*c)

escreval ("Delta � igual a: ",d)

se d < 0 entao
   escreval ("As ra�zes n�o s�o reais.")
senao

// C�uculos das ra�zes
//x1 <- (-b + rad(d)) / (2*a)
//x2 <- (-b - rad(d)) / (2*a)
x1 <- (-b + raizq (d)) / (2*a)
x2 <- (-b - d^(1/2)) / (2*a)

escreval ("X1= ",x1:4:2," e X2= ",x2:4:2)
fimse
fimalgoritmo

