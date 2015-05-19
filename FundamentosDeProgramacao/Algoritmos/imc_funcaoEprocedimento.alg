algoritmo "semnome"
// Função :
// Autor :
// Data : 19/09/2014
// Seção de Declarações 
var //Globais
p, h, i : real

funcao fPeso() : real
var
peso : real
inicio
      escreva ("Peso (kg): ")
      leia (peso)
      retorne peso
fimfuncao

funcao fAltura() : real
var
altura : real
inicio
       escreva ("altura (m): ")
       leia (altura)
       retorne altura
fimfuncao

procedimento calcimc(x,y: real)
var
imc : real
inicio
      imc <- x/(y*y)
      escreval ("IMC: ",imc:4:2)
      se imc <17 entao
         escreva("Muito abaixo do peso!")
      fimse
fimprocedimento

inicio
p <- fPeso()
h <- fAltura()
calcimc(p,h)

fimalgoritmo
