algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 18/09/2014
// Se��o de Declara��es 
var
   n1, n2 : inteiro
   media : real
inicio
// Se��o de Comandos
   escreva ("Primeira nota: ")
   leia (n1)
   escreva ("Segunda nota: ")
   leia (n2)
   media <- (n1+n2)/2
   escreva ("M�dia ",media,". ")
   se (media < 6) entao
      escreva ("Aluno Reprovado.")
   senao
        se (media >=6) e (media <7) entao
           escreva ("Aluno de Recupera��o.")
        senao
             escreva ("Aluno APROVADO!!!")
        fimse
   fimse
   
fimalgoritmo
