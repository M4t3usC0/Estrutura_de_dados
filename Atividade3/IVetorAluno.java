package Atividade3;


public interface IVetorAluno {
    
    public void adiciona(Aluno aluno);
    public int getTamanho();
    public boolean contem(Aluno aluno);
    public boolean cheio();
    public boolean remove(Aluno aluno);

}