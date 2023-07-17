package Atividade12;

public class Aluno {

    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome) && this.idade == outro.idade && this.nota == outro.nota;
    }

    @Override
    public String toString() {
        return "Aluno [idade=" + idade + ", nome=" + nome + ", nota=" + nota + "]";
    }



}