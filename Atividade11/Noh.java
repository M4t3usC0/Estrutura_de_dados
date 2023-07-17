package Atividade11;

public class Noh<T> {
    
    private T info;
    private Noh<T> proximo;

    public Noh(T info) {
        this.info = info;
        this.proximo = null;
    }

    public T getInfo() {
        return info;
    }

    public Noh<T> getProximo() {
        return proximo;
    }

    public void setProx(Noh<T> n) {
        this.proximo = n;
    }
}

