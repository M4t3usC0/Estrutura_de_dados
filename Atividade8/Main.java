package Atividade8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10000;

        Random gerador = new Random();

        Vetor vetor = new Vetor(n);

        for (int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt(1000);
            vetor.adiciona(numeroAleatorio);
        }

        int numeroAleatorio = gerador.nextInt(1000);

        long tempoInicio, tempoFim, duracao;

        tempoInicio = System.nanoTime();
        boolean buscaBinariaIterativa = vetor.buscaBinariaIterativa(numeroAleatorio);
        tempoFim = System.nanoTime();

        duracao = tempoFim - tempoInicio;

        System.out.println("Busca iterativa; Encontrado: " + buscaBinariaIterativa + "; Tempo: " + duracao + "ns");

        tempoInicio = System.nanoTime();
        boolean buscaBinariaRecursiva = vetor.buscaBinariaRecursiva(numeroAleatorio);
        tempoFim = System.nanoTime();

        duracao = tempoFim - tempoInicio;

        System.out.println("Busca recursiva; Encontrado: " + buscaBinariaRecursiva + "; Tempo: " + duracao + "ns");
    }
}
