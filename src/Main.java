public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.print("vetor desordenado = ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        // i = desordenado
        // j = ordenado = i-1
        // key = vetor[i] = vertor[desordenao]
        //      [10,9,8,7,6,5,4,3,2,1,0]
        //      [5,6,7,8,9,10,4,3,2,1,0]
        //i= 5              j|i
        //j =6    0 1 2 3 4 5 6 7 8 9

        for (int desordenado = 1; desordenado < vetor.length; desordenado++) {
            int numeroSelecionado = vetor[desordenado];
            int ordenado = desordenado - 1;

            while (ordenado >= 0 && vetor[ordenado] < numeroSelecionado) {

            }
        }
    }
}