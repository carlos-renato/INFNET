algoritmo "semnome"
// Função :
// Autor :
// Data : 18/09/2014
// Seção de Declarações 
var
   n1, n2 : inteiro
   media : real
inicio
// Seção de Comandos
   escreva ("Primeira nota: ")
   leia (n1)
   escreva ("Segunda nota: ")
   leia (n2)
   media <- (n1+n2)/2
   escreva ("Média ",media,". ")
   se (media < 6) entao
      escreva ("Aluno Reprovado.")
   senao
        se (media >=6) e (media <7) entao
           escreva ("Aluno de Recuperação.")
        senao
             escreva ("Aluno APROVADO!!!")
        fimse
   fimse
   
fimalgoritmo
