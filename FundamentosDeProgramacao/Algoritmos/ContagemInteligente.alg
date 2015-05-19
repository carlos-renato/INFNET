algoritmo "ContagemInteligente"
// Função :
// Autor :
// Data : 18/09/2014
// Seção de Declarações 
var
   i, f, cont : inteiro
inicio
// Seção de Comandos
   escreval ("Inicio da contagem: ")
   leia (i)
   escreva ("Fim da contagem: ")
   leia (f)
   
   cont <- f
   se i < f entao
   //contagem crescente
              enquanto i <= f faca
                       escreva (" ...",i)
                       i <- i + 1
              fimenquanto
   senao
              enquanto i >= f faca
                       escreva (" ...",i)
                       i <- i - 1
              fimenquanto
   fimse
fimalgoritmo
