package Atividade3;

public class VetorObject implements IVetorObject {

    private Object[] vetor;
    private int total;

    public VetorObject(int tamanhoMaximo) {
        vetor = new Object[tamanhoMaximo];
        total = 0;
    }

    public VetorObject() {
        vetor = new Object[3];
        total = 0;
    }

    public void adiciona(Object object) {
        garanteEspaco();
        vetor[total] = object;
        total++;
    }

    public boolean contem(Object object) {
        for (int i = 0; i < total; i++) {
            if (vetor[i].equals(object)) {
                return true;
            } 
        }
        return false;
    }

    public int getTamanho() {
        return total;
    }

    @Override
    public boolean cheio() {
        if(total == vetor.length) {
            return true;
        }
        return false;
    }

    private void garanteEspaco() {
        if(cheio()) {
            Object[] novoVetor = new Object[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
        }
    }

    @Override
    public boolean remove(Object object) {
        int posicao = -1;
        for (int i = 0; i < total; i++) {
            if(vetor[i].equals(object)) {
                posicao = i;
                break;
            }
        }
        if(posicao != -1) {
            for (int i = posicao; i < total - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[total - 1] = null;
            total--;
            return true;
        }
        return false;
    }
}