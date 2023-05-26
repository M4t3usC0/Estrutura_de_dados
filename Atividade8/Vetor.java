package Atividade8;

public class Vetor {
    private int[] vetor;
    private int total;

    public Vetor(int tamanhoMaximo) {
        vetor = new int[tamanhoMaximo];
        total = 0;
    }

    public void adiciona(int numero) {
        if (total < vetor.length) {
            vetor[total] = numero;
            total++;
        } else {
            System.out.println("Erro: vetor está cheio!");
        }
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

    public boolean buscaBinariaIterativa(int numero) {
        int inicio = 0;
        int fim = total - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor[meio] == numero) {
                return true;
            } else if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return false;
    }

    public boolean buscaBinariaRecursiva(int numero) {
        return buscaBinariaRecursiva(numero, 0, total - 1);
    }

    private boolean buscaBinariaRecursiva(int numero, int inicio, int fim) {
        if (inicio > fim) {
            return false;
        }

        int meio = (inicio + fim) / 2;
        if (vetor[meio] == numero) {
            return true;
        } else if (vetor[meio] < numero) {
            return buscaBinariaRecursiva(numero, meio + 1, fim);
        } else {
            return buscaBinariaRecursiva(numero, inicio, meio - 1);
        }
    }
}
