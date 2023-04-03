package Atividade1;

import java.util.function.ToDoubleFunction;

public class Vetor {
        private Aluno[] alunos = new Aluno[100];
        private int totalDeAlunos = 0;

    public Vetor () {
        alunos = new Aluno[100];
    }
    
        public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
        
        }

        public void remove(Aluno aluno){
            int indice = this.indiceDo(aluno);
            if (indice == this.totalDeAlunos-1){
                this.alunos[indice]= null;
                this.totalDeAlunos-=1;
            }else{
                this.alunos[indice] = null;
                for(int i = indice; i < this.totalDeAlunos-1; i++){
                    this.alunos[i] = this.alunos[i+1];
                }
                this.totalDeAlunos-=1;
            }

        }

        public int tamanho(){
           return this.totalDeAlunos;
        }

        public boolean contem (Aluno aluno){
            for (int i = 0; i < this.totalDeAlunos; i++) {
                if (aluno.equals(this.alunos[i])) {
                    return true;
                }
            }
            return false;
        }

        public int indiceDo (Aluno aluno){
            for (int i = 0; i < this.totalDeAlunos; i++) {
                if (aluno.equals(this.alunos[i])) {
                    return i;
                }
            }
            return -1;
        }

        public String exibeTodos() {
            String res = "";
            for (int i = 0; i < this.totalDeAlunos; i++) {
                res += "["+i+"] " +this.alunos[i].toString();
            }
            return res;
        }

}
