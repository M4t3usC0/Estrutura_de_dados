package Atividade14;

public interface Lista {

    public void insereInicio(Aluno info);
    public void insereFim(Aluno info);
    public boolean estahVazia();
    public boolean remove(Aluno info);
    public int tamanho();
    public String imprimirLista();
    
}