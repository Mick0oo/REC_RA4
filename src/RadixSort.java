public class RadixSort {
    static int trocas = 0;
    static int iteracoes = 0;

    public static void ordenar(int[] dados, int t) {
        if (dados == null || t == 0) return;
        trocas = 0;
        iteracoes = 0;

        int max = getMax(dados, t);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            iteracoes++;
            ordCont(dados, exp, t);
        }
    }

    private static int getMax(int[] dados, int t) {
        int max = dados[0];
        for (int i = 1; i < t; i++) {
            iteracoes++;
            if (dados[i] > max) {
                max = dados[i];
            }
        }
        return max;
    }

    private static void ordCont(int[] dados, int exp, int t) {
        int[] output = new int[t];
        int[] contador = new int[10];

        for (int i = 0; i < t; i++) {
            iteracoes++;
            int num = (dados[i] / exp) % 10;
            contador[num]++;
        }

        for (int i = 1; i < 10; i++) {
            iteracoes++;
            contador[i] += contador[i - 1];
        }

        for (int i = t - 1; i >= 0; i--) {
            iteracoes++;
            int num = (dados[i] / exp) % 10;
            output[contador[num] - 1] = dados[i];
            contador[num]--;
        }

        for (int i = 0; i < t; i++) {
            iteracoes++;
            dados[i] = output[i];
            trocas++;
        }
    }


    public static void main(String[] args) {
        int[] dataset1 = {1, 100, 2, 99, 3, 98, 4, 97, 5, 96, 6, 95, 7, 94, 8, 93, 9, 92, 10,
                91, 11, 90, 12, 89, 13, 88, 14, 87, 15, 86, 16, 85, 17, 84, 18,
                83, 19, 82, 20, 81, 21, 80, 22, 79, 23, 78, 24, 77, 25, 76};
        int tam_1 = 50;

        int[] dataset2 = {1, 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89 ,88 ,87 ,86 , 85,
                84 ,83 ,82, 81 ,80 ,79 ,78 ,77 ,76 ,75 ,74 ,73 ,72, 71 ,70 ,69 ,68 ,
                67 ,66 ,65 ,64 ,63 ,62, 61 ,60 ,59 ,58 ,57 ,56 ,55 ,54 ,53 ,52};
        int tam_2 = 50;

        int[] dataset3 = {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34,
                33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17,
                16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,4,3,2,1};
        int tam_3 = 50;


        System.out.println("RadixSort:");

        int repeticoes = 100;


        System.out.println("\nDataset 1 ORIGINAL:");
        Ferramentas.imprimir_vet(dataset1);

        long somaTempos1 = 0;
        long somaIteracoes1 = 0;
        long somaTrocas1 = 0;

        for (int i = 0; i < repeticoes; i++) {
            int[] copia = Ferramentas.copiarVetor(dataset1, tam_1);
            long ini = System.nanoTime();
            ordenar(copia, tam_1);
            long fim = System.nanoTime();
            somaTempos1 += (fim - ini);
            somaIteracoes1 += iteracoes;
            somaTrocas1 += trocas;
        }

        double media1 = (double) somaTempos1 / (repeticoes * 1_000_000.0);
        System.out.println("Tempo médio de execução (Dataset 1): " + media1 + " ms");
        System.out.println("Média de iterações: " + (somaIteracoes1 / repeticoes));
        System.out.println("Média de trocas: " + (somaTrocas1 / repeticoes));

        System.out.println("\nDataset 2 ORIGINAL:");
        Ferramentas.imprimir_vet(dataset2);

        long somaTempos2 = 0;
        long somaIteracoes2 = 0;
        long somaTrocas2 = 0;

        for (int i = 0; i < repeticoes; i++) {
            int[] copia2 = Ferramentas.copiarVetor(dataset2, tam_2);
            long ini = System.nanoTime();
            ordenar(copia2, tam_2);
            long fim = System.nanoTime();
            somaTempos2 += (fim - ini);
            somaIteracoes2 += iteracoes;
            somaTrocas2 += trocas;
        }

        double media2 = (double) somaTempos2 / (repeticoes * 1_000_000.0);
        System.out.println("\nDataset 2 ORDENADO:");
        System.out.println("Tempo médio de execução (Dataset 2): " + media2 + " ms");
        System.out.println("Média de iterações: " + (somaIteracoes2 / repeticoes));
        System.out.println("Média de trocas: " + (somaTrocas2 / repeticoes));


        System.out.println("\nDataset 3 ORIGINAL:");
        Ferramentas.imprimir_vet(dataset3);

        long somaTempos3 = 0;
        long somaIteracoes3 = 0;
        long somaTrocas3 = 0;

        for (int i = 0; i < repeticoes; i++) {
            int[] copia3 = Ferramentas.copiarVetor(dataset3, tam_3);
            long ini = System.nanoTime();
            ordenar(copia3, tam_3);
            long fim = System.nanoTime();
            somaTempos3 += (fim - ini);
            somaIteracoes3 += iteracoes;
            somaTrocas3 += trocas;
        }

        double media3 = (double) somaTempos3 / (repeticoes * 1_000_000.0);
        System.out.println("Tempo médio de execução (Dataset 3): " + media3 + " ms");
        System.out.println("Média de iterações: " + (somaIteracoes3 / repeticoes));
        System.out.println("Média de trocas: " + (somaTrocas3 / repeticoes));

    }
}

