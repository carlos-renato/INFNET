algoritmo "aCarteira de Habilita��o"
// Fun��o :
// Autor :
// Data : 29/08/2014
// Se��o de Declara��es 
var
nas : inteiro // ano de nascimento
ano : inteiro // ano corrente
i : inteiro //idade
inicio
// Se��o de Comandos 
escreval ("Nascimento: ")
leia (nas)
escreval ("Ano: ")
leia (ano)
i <- ano - nas
escreval (i)
se (i < 16) entao
   escreval (" No vote, no drive")
   senao
        se (i = 16) ou (i = 17) entao
           escreval ("Vote, but do not drive")
           senao
                se i >= 18 entao
                   escreval ("Vote and drive asshole!!!")
                fimse
        fimse
fimse

fimalgoritmo
