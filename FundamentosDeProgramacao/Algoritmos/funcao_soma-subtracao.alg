algoritmo "semnome"
// Função :
// Autor :
// Data : 12/09/2014
// Seção de Declarações 
var
   r,n1,n2,op : inteiro //Resultado

   funcao somar (x1,x2: inteiro): inteiro
   var
   soma: inteiro
   
   inicio
   soma <- x1+x2
   retorne soma
   fimfuncao
   
   funcao subtrair (y1,y2: inteiro): inteiro
   var
   subtraendo: inteiro
   
   inicio
   subtraendo <- y1-y2
   retorne subratendo
   fimfuncao
   
inicio
// Seção de Comandos
escreva ("Digite 1 para SOMAR ou 2 para SUBTRAIR: ")
leia (op)
escreval ("Insira os número que deseja calcular: ")
leia (n1,n2)

se op = 1 entao
   r <- somar(n1,n2)
   escreva (r)
   senao
        se op = 2 entao
           r <- subtrair (n1,n2)
           escreva (r)
        fimse
fimse

 
fimalgoritmo

