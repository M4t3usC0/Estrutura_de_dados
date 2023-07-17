package Atividade14;

public class MapaHashLSE {

    private LSE[] vetor;

    public MapaHashLSE() {
        this.vetor = new LSE[10];
    }

    private int hash(int chave) {
        return chave % vetor.length;
    }

    public void put(int chave, Aluno valor) {
        int hash = hash(chave);

        if(hash > vetor.length) {
            resize();
            put(chave, valor);
            return;
        }

        LSE alunos_lista = this.vetor[hash];
        
        if (alunos_lista == null) {
            alunos_lista = new LSE();
            alunos_lista.insereInicio(valor);
            this.vetor[hash] = alunos_lista;

        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (n.getInfo().getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunos_lista.insereInicio(valor);
        }
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        LSE alunos_lista = this.vetor[hash];

        if (alunos_lista == null) {
            return null;
        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (n.getInfo().getMatricula() == chave) {
                    return n.getInfo();
                }
            }
            return null;
        }
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        LSE alunos_lista = this.vetor[hash];

        if (alunos_lista == null) {
            return null;
        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (n.getInfo().getMatricula() == chave) {
                    Aluno aluno = n.getInfo();
                    alunos_lista.remove(aluno);
                    return aluno;
                }
            }
            return null;
        }
    }

    private void resize() {
        LSE[] novo_vetor = new LSE[this.vetor.length + 1];

        rehash(novo_vetor);

        this.vetor = novo_vetor;
    }

    private void rehash(LSE[] novoVetor) {
        for (int i = 0; i < this.vetor.length; i++) {
            LSE alunos_lista = this.vetor[i];
            if (alunos_lista != null) {
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    int hash = n.getInfo().getMatricula() % novoVetor.length;
                    LSE nova_lista = novoVetor[hash];
                    if (nova_lista == null) {
                        nova_lista = new LSE();
                        nova_lista.insereInicio(n.getInfo());
                        novoVetor[hash] = nova_lista;
                    } else {
                        nova_lista.insereInicio(n.getInfo());
                    }
                }
            }
        }
    }




    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.vetor.length; i++) {
            LSE alunos_lista = this.vetor[i];
            if (alunos_lista != null) {
                str += "Hash: " + i + "\n";
                for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                    str += n.getInfo().toString() + "\n";
                }
            }
        }
        return str;
    }
}
