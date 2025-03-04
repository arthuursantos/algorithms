package grokkingAlgorithms.chapter1;

public class BinarySearch {

    public static Integer search(int[] array, int target) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (array[mid]==target) {
                return mid;
            } else if (array[mid]<target) {
                first = mid+1;
            } else {
                last = mid-1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {2, 12, 24, 47, 57, 84}; // o array precisa estar ordenado
        System.out.println("index " + search(array, 84));;
    }

    // 1.1 Suponha que você tenha uma lista com 128 nomes e esteja a fazer uma
    // pesquisa binária. Qual seria o número máximo de etapas que você levaria
    // para encontrar o nome desejado?
    // R: log 128 = 7

    // 1.2 Suponha que você duplique o tamanho da lista. Qual seria o número
    // máximo de etapas agora?
    // R: log 256 = 8


}