# Primeira Avaliacao

1. [0,25] Crie um novo projeto, com o nome "EXNomedoAluno"

2. [0,25] Crie a classe, não executável, "RH". Observe atentamente o código abaixo antes de criar a classe:

OBS: Você tem liberdade para alterar o código desta classe se for NECESSÁRIO, e deve justificar CADA alteração com um comentário no código alterado. Ainda, a linha de código original deve ser preservada em um comentário de fim de linha, e a linha de código modificada deve vir abaixo da original.

package com.booble.adm;

class RH
{
void exibirStatus()
{
System.out.println("Iniciando Exibição do Status da Empresa");
System.out.println("BLAH BLAH BLAH");
System.out.println("Encerrando Exibição do Status da Empresa");
}

int determinarPagamento(int tipoDeContrato)
{
int valor = 0;

switch(tipoDeContrato)
{
case 1:
valor = 50;
break;

case 2:
valor = 20;
break;

default:
valor = 10;
}

return valor;
}
}

3. [1,0] Crie a classe, não executável, "Colaborador". Esta classe representa um funcionário de uma empresa. Um funcionário deve possuir nome, matrícula, idade, sexo, tipo de contrato e carga horária (quantas horas por semana ele trabalha). O tipo de contrato é representado por um número que deve ser 1, 2 ou 3 (1 = Gerente, 2 = Líder de Equipe, 3 = Estagiário). Crie também TODOS os métodos que julgar necessário. Esta classe deve ficar no "pacote com.booble.operacional"

4. [1,0] Justifique, com comentários nos métodos e membros de dados da classe "Colaborador", a escolha pelos modificadores utilizados.

5. [1,0] Crie a classe, não executável, "FolhadePagamento". Esta classe deve ficar no "pacote com.booble.operacional". A Classe folha de pagamento deve possuir ano, mês e número de série. A variável número de série deve ser acessível diretamente da classe, sem a necessidade de um objeto, e representa um identificador da última folha de pagamento gerada. A classe também deve possuir um vetor de colaboradores, com apenas 3 elementos. Crie também TODOS os métodos que julgar necessário.

6  [2,0] Crie o método "cadastrarColaborador", que recebe todos os dados de um colaborador (ver item 3), cria um "Colaborador", e o coloca no vetor de colaboradores. O índice do vetor onde o novo colaborador deve ser posto também é recebido pelo método.

7. [1,0] Justifique, com comentários nos métodos e membros de dados da classe "FolhadePagamento", a escolha pelos modificadores utilizados.

8. [3,5] Crie uma classe executável. Ela deve realizar as seguintes operações:

* Exibir o estado da empresa através do método "exibirStatus" da classe RH.

* Cadastrar, utilizando o método criado (você pode inventar os valores e digitá-los diretamente no código), 3 colaboradores na empresa.

* Percorrer o vetor de colaboradores e, para CADA colaborador, exibir na tela o nome do colaborador e seu salário. O nome deve ser obtido diretamente do objeto (p. ex. um "getter"). O salário deve ser calculado através da multiplicação da carga horária de um colaborador pelo
RETORNO do método "determinarPagamento".

* Você NÃO pode instanciar nenhum objeto do tipo RH.

* Exibir o estado da empresa através do método "exibirStatus" da classe RH.