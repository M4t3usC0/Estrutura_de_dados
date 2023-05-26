package Atividade7;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 1000;

        Random gerador = new Random();

        Vetor vetor = new Vetor(n);

        for(int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt();
            vetor.adiciona(numeroAleatorio);
        }

        long tempoComeco = System.nanoTime();
        int maximoIterativa = vetor.maximoIterativa();
        long tempoFinal = System.nanoTime();

        long duracao = tempoFinal - tempoComeco;
       
        System.out.println("Máximo iterativa: " + maximoIterativa + "; Tempo: " + duracao + "ns");
        
        tempoComeco = System.nanoTime();
        int maximoRecursiva = vetor.maximoRecursiva();
        tempoFinal = System.nanoTime();
        duracao = tempoFinal - tempoComeco;
        
        System.out.println("Máximo recursiva: " + maximoRecursiva + "; Tempo: " + duracao + "ns");
    }
}