package Atividade2;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 19, 8.5);
        
        Aluno aluno3 = new Aluno("João", 20, 7.5);

        Vetor vetAlunos = new Vetor();
        vetAlunos.adiciona(aluno1);

        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno2));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno3));
    }    
}