package Questão6;

public class Noh {
    private int info;
    private Noh proximo;
    private Noh anterior;
    public Noh(int info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }
    
    public int getInfo() {
        return info;
    }
    
    public Noh getProximo() {
        return proximo;
    }
    
    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
    
    public Noh getAnterior() {
        return anterior;
    }
    
    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }
}
    