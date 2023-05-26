package Atividade8;


import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 10000;

        Random gerador = new Random();

        Vetor vetor = new Vetor(n);

        for(int j = 0; j < n; j++) {
            int numeroAleatorio = gerador.nextInt(1000);
            vetor.adiciona(numeroAleatorio);
        }

        int numeroAleatorio = gerador.nextInt(1000);

        long tempoComeco = System.nanoTime();
        boolean buscaBinariaIterativa = vetor.buscaBinariaIterativa(numeroAleatorio);
        long tempoFinal = System.nanoTime();

        long duracao = tempoFinal - tempoComeco;

        System.out.println("Busca iterativa; Encontrado: " + buscaBinariaIterativa + "; Tempo: " + duracao + "ns");

        tempoComeco = System.nanoTime();
        boolean buscaBinariaRecursiva = vetor.buscaBinariaRecursiva(numeroAleatorio);
        tempoFinal = System.nanoTime();

        duracao = tempoFinal - tempoComeco;

        System.out.println("Busca recursiva; Encontrado: " + buscaBinariaRecursiva + "; Tempo: " + duracao + "ns");
    }
}
