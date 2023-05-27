package Questão7;

public class LSE implements Lista {

    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(Object info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
        } else {
            Noh ultimo = null;
            Noh i = inicio;

            while (i != null) {
                ultimo = i;
                i = i.getProximo();
            }

            ultimo.setProximo(novo);
        }
    }

    @Override
    public boolean estahVazia() {
        return inicio == null;
    }

    @Override
    public boolean remove(Object info) {
        Noh anterior = null;
        Noh atual = inicio;

        while (atual != null && !atual.getInfo().equals(info)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null) {
            return false;
        }

        if (anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;
        Noh i = inicio;

        while (i != null) {
            tamanho++;
            i = i.getProximo();
        }

        return tamanho;
    }

    @Override
    public String imprimirLista() {
        StringBuilder lista = new StringBuilder();
        Noh i = inicio;

        while (i != null) {
            lista.append(i.getInfo()).append(" ");
            i = i.getProximo();
        }

        return lista.toString();
    }

    @Override
    public void imprime_rec() {
        imprime_rec(inicio);
    }

    private void imprime_rec(Noh i) {
        if (i != null) {
            System.out.print(i.getInfo() + " ");
            imprime_rec(i.getProximo());
        }
    }
}
