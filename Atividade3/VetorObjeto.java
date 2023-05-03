package Atividade3;

public class Vetor implements IVetorAluno {

    private Aluno[] vetor;
    private int total;

    public Vetor(int tamanhoMaximo) {
        vetor = new Aluno[tamanhoMaximo];
        total = 0;
    }

    public Vetor() {
        vetor = new Aluno[3];
        total = 0;
    }

    public void adiciona(Aluno aluno) {
        garanteEspaco();
        vetor[total] = aluno;
        total++;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < total; i++) {
            if (vetor[i].equals(aluno)) {
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
            Aluno[] novoVetor = new Aluno[vetor.length * 2];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
        }
    }

    @Override
    public boolean remove(Aluno aluno) {
        int posicao = -1;
        for (int i = 0; i < total; i++) {
            if(vetor[i].equals(aluno)) {
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