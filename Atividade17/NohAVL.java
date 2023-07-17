package Atividade17;

public class NohAVL {
    private int Info;
    private NohAVL esq;
    private NohAVL dir;
    private NohAVL pai;
    private int balanceamento;

    public NohAVL(int info) {
        Info = info;
    }

    public int getInfo() {
        return Info;
    }

    public void setInfo(int info) {
        Info = info;
    }

    public NohAVL getPai() {
        return pai;
    }

    public void setPai(NohAVL pai) {
        this.pai = pai;
    }

    public NohAVL getDir() {
        return dir;
    }

    public void setDir(NohAVL dir) {
        this.dir = dir;
    }

    public NohAVL getEsq() {
        return esq;
    }

    public void setEsq(NohAVL esq) {
        this.esq = esq;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }
}
