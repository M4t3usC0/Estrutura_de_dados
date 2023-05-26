package Atividade9;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 1000;

        Random gerador = new Random();

        Vetor vetor1 = new Vetor(n);
        Vetor vetor2 = new Vetor(n);
        Vetor vetor3 = new Vetor(n);

        for (int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt(1000);
            vetor1.adiciona(numeroAleatorio);
            vetor2.adiciona(numeroAleatorio);
            vetor3.adiciona(numeroAleatorio);
        }

        long duracao;

        duracao = medirTempoExecucao(() -> vetor1.bubbleSort());
        System.out.println("   BubbleSort: " + duracao + "ns");

        duracao = medirTempoExecucao(() -> vetor2.selectionSort());
        System.out.println("SelectionSort: " + duracao + "ns");

        duracao = medirTempoExecucao(() -> vetor3.insertionSort());
        System.out.println("InsertionSort: " + duracao + "ns");
    }

    private static long medirTempoExecucao(Runnable runnable) {
        long tempoInicial = System.nanoTime();
        runnable.run();
        long tempoFinal = System.nanoTime();
        return tempoFinal - tempoInicial;
    }
}
