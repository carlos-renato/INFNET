algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 20/08/2014
// Se��o de Declara��es 
var
num : inteiro
inicio
      escreva ("Insira o n�mero que deseja consultar: ")
      leia (num)
      se num > 0 entao
         escreval (num, " � um n�mero positivo.")
      senao
              se num < 0 entao
                 escreval (num, " � um n�mero negativo.")
              senao
                 escreval (num, "� um n�mero nulo.")
              fimse
      fimse
// Se��o de Comandos 
fimalgoritmo
