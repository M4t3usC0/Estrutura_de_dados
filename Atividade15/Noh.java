package Atividade15;

public class Noh {
    int valor;
    Noh esq;
    Noh dir;
    Noh pai;

    Noh(int v){
        this.valor = v;

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Noh getEsq() {
        return esq;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    public Noh getDir() {
        return dir;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }
    


}
