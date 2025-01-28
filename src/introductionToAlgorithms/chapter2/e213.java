package introductionToAlgorithms.chapter2;

import java.util.ArrayList;
import java.util.List;

// 2.1-3 Considere o problema de busca:
// Entrada: Uma sequência de N números A = 〈a1, a2, ..., an〉 e um valor v.
// Saída: Um índice i tal que v = A[i] ou o valor especial NIL, se v não aparecer em A.
// Escreva o pseudocódigo para busca linear, que faça a varredura da sequência, procurando por v. Usando
//  um invariante de laço, prove que seu algoritmo é correto. Certifique-se de que seu invariante de laço satisfaz
//  as três propriedades necessárias.

public class e213 {

    public static Integer search(List<Integer> nums, Integer v) {
        for (int i = 0; i<nums.size(); i++) {
            if (nums.get(i) == v) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(23, 5, 12, 67, 2, 34, 76, 7));
        System.out.println(search(nums, 12));
    }
}

// nums[0...i-1] nunca vai ser igual ao valor em V, essa é a invariante
// inicialização: antes da primeira iteração, não existem valores a serem comparados, então é verdadeiro
// manutenção: em qualquer iteração, o indice i vai ser retornado antes de ser incrementado, então tambem é verdadeiro
// término: no final das iterações, caso i não for encontrado, null é retornado, e a invariante segue verdadeira
