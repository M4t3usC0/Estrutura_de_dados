

public class LSE implements Ilista {
    private Noh inicio;


    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        novo.setProximo(this.inicio);
        this.inicio = novo;
    }
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (this.inicio == null) {
            this.inicio = novo;
        } else {
            Noh aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }
    public boolean estahVazia() {
        return this.inicio == null;
    }

    public boolean remove(Object info){
        Noh aux = this.inicio;
        Noh ant = null;
        while (aux != null) {
            if (aux.getInfo().equals(info)) {
                if (ant == null) {
                    this.inicio = aux.getProximo();
                } else {
                    ant.setProximo(aux.getProximo());
                }
                return true;
            }
            ant = aux;
            aux = aux.getProximo();
        }
        return false;
    }


    public Object tamanho(){
        int cont = 0;
        Noh aux = this.inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }
        return cont;
    }


    public void imprime() {
        Noh aux = this.inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProximo();
        }
    }


}
