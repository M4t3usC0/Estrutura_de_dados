package Atividade5;

public interface Lista {

    public void insereNoInicio(int info);
    public void insereNoFinal(int info);
    public boolean verificaVazia();
    public boolean remover(int info);
    public int tamanho();

    
    public String getListaInicio();

    
    public String getListaFim();

}