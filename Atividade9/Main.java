package Atividade9;


import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 1000;

        Random gerador = new Random();

        Vetor vetor1 = new Vetor(n);
        Vetor vetor2 = new Vetor(n);
        Vetor vetor3 = new Vetor(n);

        for(int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt(1000);
            vetor1.adiciona(numeroAleatorio);
            vetor2.adiciona(numeroAleatorio);
            vetor3.adiciona(numeroAleatorio);
        }

        long tempoInicial = System.nanoTime();
        vetor1.bubbleSort();
        long tempoFinal = System.nanoTime();
        long duracao = tempoFinal - tempoInicial;
        System.out.println("   BubbleSort: " + duracao + "ns");

        tempoInicial = System.nanoTime();
        vetor2.selectionSort();
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempoInicial;
        System.out.println("SelectionSort: " + duracao + "ns");

        tempoInicial = System.nanoTime();
        vetor3.insertionSort();
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempoInicial;
        System.out.println("InsertionSort: " + duracao + "ns");

    }
}