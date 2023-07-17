package Atividade12;

public class FilaLista implements IFila {
    
    private Noh inicio;
    private Noh fim;

    @Override
    public boolean add(Aluno info) {
        Noh novo = new Noh(info);

        if(isEmpty()) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }

        fim = novo;
        return true;
    }

    @Override
    public boolean remove() {

        if(!isEmpty()) {
            if(inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProximo();
            }
            return true;
        }
        return false;

    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Noh aux = inicio;

        while(aux != null) {
            cont++;
            aux = aux.getProximo();
        }

        return cont;
    }

    @Override
    public String toString() {
        String str = "";
        Noh aux = inicio;

        while(aux != null) {
            str += aux.getInfo() + " ";
            aux = aux.getProximo();
        }

        return str;
    }

}
