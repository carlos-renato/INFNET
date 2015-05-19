algoritmo "semnome"
// Função :
// Autor :
// Data : 18/09/2014
// Seção de Declarações 
var
   emp, parc : real
   //emp : valor do empréstimo
   //parc : número de parcelas
inicio
// Seção de Comandos
escreva ("Qual o valor do emprestimo? ")
leia (emp)
escreva ("Deseja pagá-lo em quantas parcelas? ")
leia (parc)
emp <- emp + (emp*20)/100
escreva ("Você pagará ",parc, " parcelas de ",emp/parc, " reais.")
fimalgoritmo
