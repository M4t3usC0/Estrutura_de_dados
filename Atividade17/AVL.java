package Atividade17;

public class AVL {

    private NohAVL raiz;


    public AVL() {
    }

    public NohAVL getRaiz() {
        return this.raiz;
    }

     public void setRaiz(NohAVL raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int info, NohAVL noAtual) {
        if (isEmpty()) {
            NohAVL novoNo = new NohAVL(info);
            raiz = novoNo;
             ajustarBalanceamento(raiz);
        } else {
            if (info < noAtual.getInfo()) {
                if (noAtual.getEsq() != null) {
                    // no com valor, vamos leva-lo para recursao.
                    add(info, noAtual.getEsq());
                } else {
                    // no null, vamos inserir.
                    NohAVL novoNo = new NohAVL(info);
                    noAtual.setEsq(novoNo);
                    novoNo.setPai(noAtual);
                    ajustarBalanceamento(raiz);
                    raiz = balanceia(raiz);
                }
            } else if (info > noAtual.getInfo()) {
                if (noAtual.getDir() != null) {
                    // no com valor, vamos leva-lo para recursao.
                    add(info, noAtual.getDir());
                } else {
                    // no null, vamos inserir.
                    NohAVL novoNo = new NohAVL(info);
                    noAtual.setDir(novoNo);
                    novoNo.setPai(noAtual);
                    ajustarBalanceamento(raiz);
                    raiz = balanceia(raiz);
                }
            } else {
                System.out.println("Caso de no ser repetido!");
            }
        }
    }
 public void ajustarBalanceamento(NohAVL noAtual) {
        noAtual.setBalanceamento(verificaAltura(noAtual.getEsq()) - verificaAltura(noAtual.getDir()));
        if (noAtual.getDir() != null) {
            ajustarBalanceamento(noAtual.getDir());
        }
        if (noAtual.getEsq() != null) {
            ajustarBalanceamento(noAtual.getEsq());
        }
    }

    public int verificaAltura(NohAVL noAtual) {
        if (noAtual == null) {
            return -1;
        }
        if (noAtual.getDir() == null && noAtual.getEsq() == null) {
            return 0;
        } else if (noAtual.getEsq() == null) {
            return 1 + verificaAltura(noAtual.getDir());
        } else if (noAtual.getDir() == null) {
            return 1 + verificaAltura(noAtual.getEsq());
        } else {
            if (verificaAltura(noAtual.getEsq()) > verificaAltura(noAtual.getDir())) {
                return 1 + verificaAltura(noAtual.getEsq());
            } else {
                return 1 + verificaAltura(noAtual.getDir());
            }
        }
    }

    public NohAVL balanceia(NohAVL noAtual) {
        if (noAtual.getBalanceamento() == 2 && noAtual.getEsq().getBalanceamento() >= 0) {
            noAtual = rotacaoADireita(noAtual);

        } else if (noAtual.getBalanceamento() == -2 && noAtual.getDir().getBalanceamento() <= 0) {
            noAtual = rotacaoAEsquerda(noAtual);

        } else if (noAtual.getBalanceamento() == 2 && noAtual.getEsq().getBalanceamento() < 0) {
            noAtual = rotacaoDuplaDireita(noAtual);

        } else if (noAtual.getBalanceamento() == -2 && noAtual.getDir().getBalanceamento() > 0) {
            noAtual = rotacaoDuplaEsquerda(noAtual);
        }

        if (noAtual.getDir() != null) {
            balanceia(noAtual.getDir());
        }
        if (noAtual.getEsq() != null) {
            balanceia(noAtual.getEsq());
        }
        return noAtual;
    }

    public NohAVL rotacaoADireita(NohAVL noAtual) {
        NohAVL aux = noAtual.getEsq();
        aux.setPai(noAtual.getPai());
        if (aux.getDir() != null) {
            aux.getDir().setPai(noAtual);
        }
        noAtual.setPai(aux);
        noAtual.setEsq(aux.getDir());
        aux.setDir(noAtual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDir() == noAtual) {
                aux.getPai().setDir(aux);
            } else if (aux.getPai().getEsq() == noAtual) {
                aux.getPai().setEsq(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public NohAVL rotacaoAEsquerda(NohAVL noAtual) {
        NohAVL aux = noAtual.getDir();
        aux.setPai(noAtual.getPai());
        if (aux.getEsq() != null) {
            aux.getEsq().setPai(noAtual);
        }

        noAtual.setPai(aux);
        noAtual.setDir(aux.getEsq());
        aux.setEsq(noAtual);
        if (aux.getPai() != null) {
            if (aux.getPai().getDir() == noAtual) {
                aux.getPai().setDir(aux);
            } else if (aux.getPai().getEsq() == noAtual) {
                aux.getPai().setEsq(aux);
            }
        }
        ajustarBalanceamento(aux);
        return aux;
    }

    public NohAVL rotacaoDuplaDireita(NohAVL noAtual) {
        NohAVL aux = noAtual.getEsq();
        noAtual.setEsq(rotacaoAEsquerda(aux));
        NohAVL aux2 = rotacaoADireita(noAtual);
        return aux2;
    }

    public NohAVL rotacaoDuplaEsquerda(NohAVL noAtual) {
        NohAVL aux = noAtual.getDir();
        noAtual.setDir(rotacaoADireita(aux));
        NohAVL aux2 = rotacaoAEsquerda(noAtual);
        return aux2;
    }

    public boolean isArvoreBalanceada(NohAVL noAtual) {
        if (noAtual == null) {
            return true;
        }
        if (noAtual.getBalanceamento() > 1 || noAtual.getBalanceamento() < -1) {
            return false;
        }
        return isArvoreBalanceada(noAtual.getEsq()) && isArvoreBalanceada(noAtual.getDir());
    }
}
