package grokkingAlgorithms.chapter1;

public class BigO {
    public static void main(String[] args) {
    }
}

// Forneça o tempo de execução para cada um dos casos a seguir em termos da
// notação Big O.

// 1.3 Você tem um nome e deseja encontrar o número de telefone para esse
// nome em uma agenda telefônica.
// R: A agenda está ordenada alfabeticamente, então é possível usar um algoritmo de pesquisa
// binária. O(log N).

// 1.4 Você tem um número de telefone e deseja encontrar o dono dele em uma
// agenda telefônica.
// R: O(n). No pior dos casos, o número vai ser último nome da agenda.

// 1.5 Você quer ler o número de cada pessoa da agenda telefônica.
// R: O(n).

// 1.6 Você quer ler os números apenas dos nomes que começam com A. (Isso
// é complicado! Esse algoritmo envolve conceitos que são abordados mais
// profundamente no Capítulo 4. Leia a resposta – você
// R: O(n).