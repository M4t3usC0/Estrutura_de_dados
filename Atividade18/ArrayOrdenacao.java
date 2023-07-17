package Atividade18;

public class ArrayOrdenacao {

    public void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);

            printArray(array);
        }
    }

    private void heapify(int[] array, int n, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = esq + 1;

        if (esq < n && array[esq] > array[maior])
            maior = esq;

        if (dir < n && array[dir] > array[maior])
            maior = dir;

        if (maior != i) {
            int troca = array[i];
            array[i] = array[maior];
            array[maior] = troca;

            heapify(array, n, maior);
        }
    }

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indiceParticao = particionar(array, inicio, fim);
            quickSort(array, inicio, indiceParticao - 1);
            quickSort(array, indiceParticao + 1, fim);
        }
    }

    private int particionar(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int indiceParticao = inicio;

        for (int i = inicio; i < fim; i++) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[indiceParticao];
                array[indiceParticao] = temp;
                indiceParticao++;
            }
        }

        int temp = array[indiceParticao];
        array[indiceParticao] = array[fim];
        array[fim] = temp;

        printArray(array);
        
        return indiceParticao;
    }

    private void printArray(int[] array) {
        System.out.print("Estado do vetor após a troca: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}