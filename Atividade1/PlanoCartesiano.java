package Atividade1;


public class PlanoCartesiano {

    private PontoCartesiano p1;
    private PontoCartesiano p2;

    public PlanoCartesiano() {
        p1 = new PontoCartesiano(0, 0);
        p2 = new PontoCartesiano(0, 0);
    }

    public PlanoCartesiano(PontoCartesiano p1, PontoCartesiano p2) {
        this.p1 = p1;
        this.p2 = p2;        
    }

    public PontoCartesiano getP1() { 
        return p1; 
    }

    public PontoCartesiano getP2() { 
        return p2; 
    }

    public void setP1(PontoCartesiano p1) { 
        this.p1 = p1; 
    }

    public void setP2(PontoCartesiano p2) { 
        this.p2 = p2; 
    }

    public double calcularDistanciaEuclidiana() {
        final double distanciaX = Math.pow(p1.getX() - p2.getX(), 2);
        final double distanciaY = Math.pow(p1.getY() - p2.getY(), 2);

        final double distancia = Math.sqrt(distanciaX + distanciaY);

        return distancia;
    }
}