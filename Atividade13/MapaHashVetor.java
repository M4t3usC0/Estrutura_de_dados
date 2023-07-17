package Atividade13;

public class MapaHashVetor {

    private Aluno[] vetor;

    public MapaHashVetor() {
        vetor = new Aluno[2];
    }

    private int hash(int chave) {
        return chave % vetor.length;
    }

    public Aluno get(int chave) {
        int hash;
        int sondagem = 0;

        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] != null && vetor[hash].getMatricula() == chave) {
                return vetor[hash];
            }
            sondagem++;
        }

        return null;
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;

        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;
        }

        if(sondagem == vetor.length) {
            resize();
            put(chave, valor);
        }
    }

    public Aluno remove(int chave) {
        int hash;
        int sondagem = 0;

        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] != null && vetor[hash].getMatricula() == chave) {
                Aluno aluno = vetor[hash];
                vetor[hash] = null;
                return aluno;
            }
            sondagem++;
        }

        return null;
    }

    private void resize() {
        Aluno[] vetorAux = vetor;
        vetor = new Aluno[vetor.length + 1];
        rehash(vetorAux);
    }

    private void rehash(Aluno[] vetorAux) {
        for(Aluno aluno : vetorAux) {
            if(aluno != null) {
                put(aluno.getMatricula(), aluno);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(Aluno aluno : vetor) {
            if(aluno != null) {
                s += aluno.toString() + "\n";
            }
        }
        return s;
    }

    
}