package Atividade11;

public class FilaLista<T> implements IFila<T> {

    private Noh<T> inicio;
    private Noh<T> fim;

    @Override
    public boolean add(T info) {
        Noh<T> novo = new Noh<>(info);

        if (isEmpty()) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }

        fim = novo;
        return true;
    }

    @Override
    public boolean remove() {
        if (!isEmpty()) {
            if (inicio == fim) {
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
        Noh<T> aux = inicio;

        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }

        return cont;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Noh<T> aux = inicio;

        while (aux != null) {
            str.append(aux.getInfo()).append(" ");
            aux = aux.getProximo();
        }

        return str.toString();
    }
}
