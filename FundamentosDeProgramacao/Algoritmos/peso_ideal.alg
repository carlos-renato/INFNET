algoritmo "C�lculo de Peso Ideal"
// Fun��o :
// Autor :
// Data : 29/08/2014
// Se��o de Declara��es 
var
sexo : inteiro
h, p : real
inicio
// Se��o de Comandos
repita
escreval ("Para peso ideal de masculino, digite 1. Para peso ideal feminino, digite 2: ")
leia (sexo)
ate (sexo = 1) ou (sexo = 2)
escreval ("Agora digite sua altura: ")
leia (h)
se sexo = 1 entao
    p <- (72.7*h)-58
    escreval ("Seu peso ideal � ",p,"kg")
    senao
         se sexo = 2 entao
         p <- (62.1*h)-44.7
         escreval ("Seu peso ideal � ",p,"kg")
         senao
              escreval (sexo," n�o � um n�mero v�lido.")
        fimse
fimse
fimalgoritmo
