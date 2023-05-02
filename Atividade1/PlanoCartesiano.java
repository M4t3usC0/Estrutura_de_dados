package Atividade1;

public class PlanoCartesiano {

    private PontoCartesiano ponto1;
    private PontoCartesiano ponto2;

    public PlanoCartesiano() {
        ponto1 = new PontoCartesiano(0, 0);
        ponto2 = new PontoCartesiano(0, 0);
    }

    public PlanoCartesiano(PontoCartesiano ponto1, PontoCartesiano ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;        
    }

    public PontoCartesiano getponto1() { 
        return ponto1; 
    }

    public PontoCartesiano getponto2() { 
        return ponto2; 
    }

    public void setponto1(PontoCartesiano ponto1) { 
        this.ponto1 = ponto1; 
    }

    public void setponto2(PontoCartesiano ponto2) { 
        this.ponto2 = ponto2; 
    }

    public double calcularDistanciaEuclidiana() {
        final double distanciaX = Math.pow(ponto1.getX() - ponto2.getX(), 2);
        final double distanciaY = Math.pow(ponto1.getY() - ponto2.getY(), 2);

        final double distancia = Math.sqrt(distanciaX + distanciaY);

        return distancia;
    }
}