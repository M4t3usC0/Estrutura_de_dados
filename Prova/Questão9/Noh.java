package Questão9;

public class Noh {

    private Object info;
    private Noh proximo;

    public Noh(Object info) {
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() { 
        return this.info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Noh getProximo() { 
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }
}
