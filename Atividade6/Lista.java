package Atividade6;

public interface Lista {

    public void insereNoInicio(Object info);
    public void insereNoFim(Object info);
    public boolean estahVazia();
    public boolean remover(Object info);
    public int tamanho();
    public String listaInicio();
    public String listaFim();

}