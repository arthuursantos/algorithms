package grokkingAlgorithms.chapter3;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(fat(5));
    }

    public static int fat(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x*(fat(x - 1));
        }
    }

}

//  3.1 Suponha que eu forneça uma pilha de chamada como esta (...)
//  Quais informações você pode retirar baseando-se apenas nesta pilha de chamada?

// R: A função sauda() foi chamada, e enquanto era executada, uma função sauda2() entrou
// em execução assumindo o topo da pilha.

// 3.2 Suponha que você acidentalmente escreveu uma função recursiva que executa
// infinitamente. Como você viu, o seu computador aloca memória para cada chamada na função.
// O que acontece com a pilha quando a função recursiva fica a executar infinitamente?

// R: Uma recursão infinita cria uma pilha infinita. Como cada pilha possui memória alocada,
// vão haver problemas na execução.