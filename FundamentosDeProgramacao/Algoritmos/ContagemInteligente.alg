algoritmo "ContagemInteligente"
// Fun��o :
// Autor :
// Data : 18/09/2014
// Se��o de Declara��es 
var
   i, f, cont : inteiro
inicio
// Se��o de Comandos
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
