algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 29/08/2014
// Se��o de Declara��es 
var
na,nb,nc : inteiro
inicio
// Se��o de Comandos

escreval ("Insira o valor de A:")
leia (na)
escreval ("Insira o valor de B")
leia (nb)
escreval ("Insira o valor de C")
leia (nc)

escreval ("Sendo A=",na,", B=",nb," e C=",nc,", temos a seguinte ordem crescente")
se (na = nb) ou (na = nc) entao
   escreval ("N�meros Iguais")
   senao
        se (na > nb) e (nb > nc) entao
           escreval ("A,B,C")
           senao
             se (na > nb) e (nc > nb) entao
                escreval ("A,C,B")
                senao
                  se (nb > na) e (na > nc) entao
                     escreval ("B,A,C")
                     senao
                          se (nb > nc) e (nc > na) entao
                             escreval ("B,C,A")
                             senao
                                  se (nc > nb) e (nb < na) entao
                                     escreval ("C,A,B")
                                     senao
                                          se (nc > nb) e (na < nb) entao
                                             escreval ("C,B,A")
                                          fimse
                                  fimse
                          fimse
                  fimse
             fimse
        fimse
fimse
fimalgoritmo
