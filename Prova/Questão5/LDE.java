package Questão5;

public class LDE implements Lista {
    private Noh inicio;
    private Noh fim;

    public LDE() {
        inicio = null;
        fim = null;
    }

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);

        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    @Override
    public boolean estahVazia() {
        return inicio == null || fim == null;
    }

    @Override
    public boolean remove(int info) {
        Noh p = consultarInfo(info);

        if (p == null) {
            return false;
        }

        if (p == inicio) {
            inicio = p.getProximo();

            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                fim = null;
            }
        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();
        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }

    public Noh consultarInfo(int info) {
        Noh p = inicio;

        while (p != null && p.getInfo() != info) {
            p = p.getProximo();
        }

        return p;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;
        Noh p = inicio;

        while (p != null) {
            tamanho++;
            p = p.getProximo();
        }

        return tamanho;
    }

    @Override
    public String getListaInicio() {
        StringBuilder lista = new StringBuilder();
        Noh p = inicio;

        while (p != null) {
            lista.append(p.getInfo()).append(" ");
            p = p.getProximo();
        }

        return lista.toString();
    }

    @Override
    public String getListaFim() {
        StringBuilder lista = new StringBuilder();
        Noh p = fim;

        while (p != null) {
            lista.append(p.getInfo()).append(" ");
            p = p.getAnterior();
        }

        return lista.toString();
    }

    @Override
    public int nroPares() {
        int quantidade = 0;
        Noh p = inicio;

        while (p != null) {
            if (p.getInfo() % 2 == 0) {
                quantidade++;
            }
            p = p.getProximo();
        }

        return quantidade;
    }
}
