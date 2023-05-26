package Atividade9;

public class Vetor {

    private int[] vetor;
    private int total;

    public Vetor(int tamanhoMaximo) {
        vetor = new int[tamanhoMaximo];
        total = 0;
    }

    public void adiciona(int numero) {
        vetor[total] = numero;
        total++;
    }

    public boolean contem(int numero) {
        for (int i = 0; i < total; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public int getTamanho() {
        return total;
    }

    public void bubbleSort() {
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    trocarElementos(j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < total; i++) {
            int menor = i;
            for (int j = i + 1; j < total; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            trocarElementos(i, menor);
        }
    }

    public void insertionSort() {
        for (int i = 1; i < total; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    private void trocarElementos(int indice1, int indice2) {
        int aux = vetor[indice1];
        vetor[indice1] = vetor[indice2];
        vetor[indice2] = aux;
    }
}
