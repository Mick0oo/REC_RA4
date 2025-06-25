public class Ferramentas {
    public static int[] copiarVetor(int[] origem, int tamanho) {
        int[] novo = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            novo[i] = origem[i];
        }
        return novo;
    }

    public static void imprimir_vet(int[] dados) {
        for (int num : dados) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
