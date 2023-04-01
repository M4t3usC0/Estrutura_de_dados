public class Vetor {
        private Aluno[] alunos = new Aluno[100];
        private int totalDeAlunos = 0;

    public Vetor () {
        alunos = new Aluno[100];
    }
    
        public void adiciona(Aluno alunos) {
        this.alunos[this.totalDeAlunos] = alunos;
        this.totalDeAlunos++;
        
        }

        public int tamanho(){
           return this.totalDeAlunos;
        }

        public boolean contem (Aluno alunos){
            for (int i = 0; i < this.totalDeAlunos; i++) {
                if (alunos.equals(this.alunos[i])) {
                    return true;
                }
            }
            return false;
        }

}
