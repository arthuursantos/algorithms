package grokkingAlgorithms.chapter2;

public class ArraysAndLinkedLists {
}

// 2.1 Suponha que você esteja criando um aplicativo para acompanhar as suas finanças.
// Todos os dias você anotará tudo o que gastou e onde gastou. No final do mês, você deverá
// revisar os seus gastos e resumir o quanto gastou. Logo, você terá um monte de inserções e
// poucas leituras. Você deverá usar um array ou uma lista para implementar este aplicativo?

// R: Lista. Inserções frequentes em arrays requerem que seus espaços na memória sejam reservados
// previamente, ou que um array inteiro seja constantemente mudado de lugar. Pra uma lista pouco importa
// a ordem de seus nós, e como as leituras serão raras (principal problema das listas), ela se torna a mais adequada.

// 2.2 Suponha que você esteja criando um aplicativo para anotar os pedidos
// dos clientes em um restaurante. Seu aplicativo precisa de uma lista de
// pedidos. Os garçons adicionam os pedidos a essa lista e os chefes retiram
// os pedidos da lista. Funciona como uma fila. Os garçons colocam os
// pedidos no final da fila e os chefes retiram os pedidos do começo dela para
// cozinhá-los. Você usaria um array ou uma lista encadeada para implementar essa lista?

// R: Lista encadeada. Deleções e inserções frequentes. Uma lista de pedido não faz
// necessidade de um acesso aleatório também, é sequencial.

// 2.3 Vamos analisar um experimento. Imagine que o Facebook guarda uma
// lista de usuários. Quando alguém tenta acessar o Facebook, uma busca é
// feita pelo nome de usuário. Se o nome da pessoa está na lista, ela pode
// continuar o acesso. As pessoas acessam o Facebook com muita
// frequência, então existem muitas buscas nessa lista. Presuma que o
// Facebook usa a pesquisa binária para procurar um nome na lista. A
// pesquisa binária requer acesso aleatório – você precisa ser capaz de
// acessar o meio da lista de nomes instantaneamente. Sabendo disso, você
// implementaria essa lista como um array ou uma lista encadeada?

// R: Array. Uma lista de usuárioa do Facebook deve ser muito grande,
// portanto, acessar os elementos da pesquisa binária sequencialmente com
// uma lista encadeada seria horrível.

// 2.4 As pessoas se inscrevem no Facebook com muita frequência também.
// Suponha que você decida usar um array para armazenar a lista de
// usuários. Quais as desvantagens de um array em relação às inserções? Em
// particular, imagine que você está usando a pesquisa binária para buscar
// os logins. O que acontece quando você adiciona novos usuários em um
// array?

// R: Arrays são lentos com inserções. Usando pesquisa binária, o array também precisa estar ordenado,
// porém novos usuários em arrays são alocados no final do array, o que faz
// necessidade de ordenação a cada inserção.

// 2.5 (...) Compare esta estrutura híbrida com arrays e listas encadeadas. É mais lento
// ou mais rápido fazer inserções e eliminações nesse caso? Você não precisa
// responder dando o tempo de execução Big(O), apenas diga se a nova
// estrutura de dados é mais rápida ou mais lenta do que os arrays e as listas
// encadeadas.

// R: Mais lenta para buscas em comparação com um array, porém mais rápida
// nas inserções.