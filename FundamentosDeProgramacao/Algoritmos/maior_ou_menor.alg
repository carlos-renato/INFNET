algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 18/09/2014
// Se��o de Declara��es 
var
   nasc, idade, ano : real
inicio
// Se��o de Comandos
   escreva ("Insita o ano atual: ")
   leia (ano)
   escreva ("Insira o ano de nascimento: ")
   leia (nasc)
   idade <- ano-nasc
   escreva ("Em ",ano," voc� ter� ",idade," anos. ")
   se idade < 18 entao
      escreva ("E ainda ser� menor de idade.")
              se idade >= 18 entao
                 escreva ("Huum! Voc� ser� maior de idade.")
              fimse
   fimse
fimalgoritmo
