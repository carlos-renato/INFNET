algoritmo "Cálculo do IMC"
// Função :
// Autor :
// Data : 22/08/2014
// Seção de Declarações 
var
p : real // peso em quilogramas
a : real // altura em metros
i : real //imc
inicio
// Seção de Comandos

i <- 0

escreval ("Algorítimo para calcular o Índice de Massa Corpórea - IMC")
escreval ("----------------------------------------------------------")

escreval ("Insira o seu peso...")
leia (p)

escreval ("Insira sua altura...")
leia (a)

i <- p/a^2

escreval (i:4)

se i < 17 entao
   escreval ("Muito abaixo do peso")
   senao
        se ((i >= 17) e (i <= 18.49)) entao
           escreval ("Abaixo do peso")
           senao
                se ((i >= 18.50) e (i <= 24.99)) entao
                   escreval ("Peso normal")
                senao
                     se ((i >= 25) e (i <=29.99 )) entao
                        escreval ("Acima do peso")
                     senao
                          se ((i >= 30) e (i <= 34.99)) entao
                             escreval ("Obesidade I")
                          senao
                               se ((i >= 35) e (i <= 39.99)) entao
                                  escreval ("Obesidade II - Severa")
                               senao
                                    se i >= 40 entao
                                       escreval ("Obesidade III - Mórbida")
                                    fimse
                               fimse
                          fimse
                     fimse
                fimse
         fimse
fimse

fimalgoritmo
