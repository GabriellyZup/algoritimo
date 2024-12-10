public class Main {
    public static void main(String[] args) {
        int[] vetor = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.print("Vetor Desordenado = ");
        imprimirVetor(vetor);

        //             [10,9,8,7,6,5,4,3,2,1,0]
        //             [5,6,7,8,9,10,4,3,2,1,0]
        //desordenado = 6          o|d
        //ordenado = 5    0 1 2 3 4 5 6 7 8 9

        for (int desordenado = 1; desordenado < vetor.length; desordenado++) {
            int numeroSelecionado = vetor[desordenado];
            int ordenado = desordenado - 1;

            while (ordenado >= 0 && vetor[ordenado] > numeroSelecionado) {
                vetor[ordenado + 1] = vetor[ordenado];

                ordenado--;

            }


            vetor[ordenado + 1] = numeroSelecionado;

            System.out.print(desordenado + " = ");
            imprimirVetor(vetor);
        }
        System.out.print("Vetor Ordenado = ");
        imprimirVetor(vetor);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i : vetor) {
            System.out.print(i + " ");

        }
        System.out.print("\n");
    }

}