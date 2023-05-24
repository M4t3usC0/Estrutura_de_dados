package Atividade1;

//atividade 1 vetor estrutura de dados

public class Main {

    public static void main(String[] args) {
        PontoCartesiano ponto1 = new PontoCartesiano(2, 6);
        PontoCartesiano ponto2 = new PontoCartesiano(2, 10);

        PlanoCartesiano pc = new PlanoCartesiano();
        pc.setP1(ponto1);
        pc.setP2(ponto2);

        System.out.println("Distância: " + pc.calcularDistanciaEuclidiana());
    }
    
}