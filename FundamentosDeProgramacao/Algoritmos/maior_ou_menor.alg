algoritmo "semnome"
// Função :
// Autor :
// Data : 18/09/2014
// Seção de Declarações 
var
   nasc, idade, ano : real
inicio
// Seção de Comandos
   escreva ("Insita o ano atual: ")
   leia (ano)
   escreva ("Insira o ano de nascimento: ")
   leia (nasc)
   idade <- ano-nasc
   escreva ("Em ",ano," você terá ",idade," anos. ")
   se idade < 18 entao
      escreva ("E ainda será menor de idade.")
              se idade >= 18 entao
                 escreva ("Huum! Você será maior de idade.")
              fimse
   fimse
fimalgoritmo
