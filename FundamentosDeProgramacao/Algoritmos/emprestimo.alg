algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 18/09/2014
// Se��o de Declara��es 
var
   emp, parc : real
   //emp : valor do empr�stimo
   //parc : n�mero de parcelas
inicio
// Se��o de Comandos
escreva ("Qual o valor do emprestimo? ")
leia (emp)
escreva ("Deseja pag�-lo em quantas parcelas? ")
leia (parc)
emp <- emp + (emp*20)/100
escreva ("Voc� pagar� ",parc, " parcelas de ",emp/parc, " reais.")
fimalgoritmo
