package Atividade3;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 19, 8.5);
        Aluno aluno3 = new Aluno("Gabriel", 20, 7.5);


        IVetorAluno vetAlunos = new Vetor();
        vetAlunos.adiciona(aluno1);
        vetAlunos.adiciona(aluno2);
        vetAlunos.adiciona(aluno3);

        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.remove(aluno3));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno3));
    }    
}