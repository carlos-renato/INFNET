algoritmo "Cálculo de Peso Ideal"
// Função :
// Autor :
// Data : 29/08/2014
// Seção de Declarações 
var
sexo : inteiro
h, p : real
inicio
// Seção de Comandos
repita
escreval ("Para peso ideal de masculino, digite 1. Para peso ideal feminino, digite 2: ")
leia (sexo)
ate (sexo = 1) ou (sexo = 2)
escreval ("Agora digite sua altura: ")
leia (h)
se sexo = 1 entao
    p <- (72.7*h)-58
    escreval ("Seu peso ideal é ",p,"kg")
    senao
         se sexo = 2 entao
         p <- (62.1*h)-44.7
         escreval ("Seu peso ideal é ",p,"kg")
         senao
              escreval (sexo," não é um número válido.")
        fimse
fimse
fimalgoritmo
