Banco "hueBR"
criar uma classe chamada Conta

criar uma enumeração chamada TipoDeConta

criar uma classe chamada Cliente

criar uma classe chamada Banco

1) - Uma conta deve conter os seguintes dados protegidos: saldo(double) e um tipo, sendo todos obrigatórios ao criar uma conta.

2) - No TipoDeConta deve retornar o texto: para CC = "Conta corrente", CP = "Conta poupança", CS = "Conta salário".

3) Um cliente deve conter os seguintes dados protegidos: nome, telefone, idade e uma conta.

4) - Ao criar um cliente é OBRIGATÓRIO que ele tenha todos os seus atributos ou somente nome e conta.(você deve reaproveitar o "nome e conta" em "todos os atributos").

5) - Um banco deve conter os seguintes dados protegidos nome e uma lista de clientes e obrigatoriamente ao criar o banco deve conter todos os atributos.

6) - Crie uma classe que contenha a main, nesta classe crie: 2 contas e 2 clientes distintos, adicione os clientes a uma lista, depois crie um banco e passe essa lista de clientes.

7) - Na classe Cliente e Conta, sobrescreva o método toString(Source/Generater toString()), lembrando que no toString da classe conta o tipo deve retornar o texto que corresponte ao tipo da conta, ex.:"Conta corrente".

8) - Na Classe Banco, crie um método para exibir todos os clientes, chame esse método na main.

9) - Para um cliente ser igual ao outro eles devem possuir o mesmo nome e telefone, implemente isso na classe cliente.

10) - Exiba se o primeiro cliente é igual ao segundo cliente.(lembre-se de pegar os clientes que estão dentro do banco, teste e vá mudando os dados para ter certeza que está funcionando).

Bonus: Na classe Cliente, crie um método estático para verificar e exibir o terceiro nome caso existir se não exibe o segundo nome em caixa alta do cliente mais rico!(não se preocupe com clientes com o mesmo valor).
