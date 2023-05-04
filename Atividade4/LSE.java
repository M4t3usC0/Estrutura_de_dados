package Atividade4;

public class LSE implements Lista {

    private Noh inicio;


    public LSE(){
        this.inicio = null;


    }

    @Override

    public void insereInicio(Object info) {
        Noh novoNoh = new Noh(info);


        if (inicio == null) {
            inicio = novoNoh;
        } else {
            novoNoh.setProximo(inicio);
            inicio = novoNoh;
        }
        
    }

    @Override

    public void inserefinal(Object info) {
        Noh novoNoh = new Noh(info);
        

        if (inicio == null) {
            inicio = novoNoh;
        } else {
            Noh aux = null;
            for(Noh i = inicio; i != null; i = i.getProximo()) {
                aux = i;
            }
            aux.setProximo(novoNoh);
        }
        
    }

    public boolean verificaSeEstaVazia() {
        return inicio == null;
    }

    public boolean remover(Object info) {

        Noh anterior = null;
        Noh atual = inicio;

        while(atual != null && !atual.getInfo().equals(info)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if(atual == null) {
            return false;
        }

        if(anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;
    }
    public int tamanho() {
        int tamanho = 0;

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }
    public String imprimir() {

        String lista = "";

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
}