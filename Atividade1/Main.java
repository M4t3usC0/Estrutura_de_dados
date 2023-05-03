package Atividade1;

public class Main {

    public static void main(String[] args) {
        PontoCartesiano ponto1 = new PontoCartesiano(1, 2);
        PontoCartesiano ponto2 = new PontoCartesiano(1, 4);

        PlanoCartesiano pc = new PlanoCartesiano();
        pc.setPonto1(ponto1);
        pc.setPonto2(ponto2);

        System.out.println("Distância: " + pc.calcularDistanciaEuclidiana());
    }
    
}