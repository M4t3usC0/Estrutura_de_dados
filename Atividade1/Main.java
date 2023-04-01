package Atividade1;
import java.util.Scanner;


public class Main{

public static void main(String[] args) {

    Vetor vetor = new Vetor();
Aluno aluno = new Aluno("Tales",20,10);
Aluno aluno2 = new Aluno("Maria", 15, 9);
Aluno aluno3 = new Aluno("Joao", 18, 8);

vetor.adiciona(aluno);
vetor.adiciona(aluno2);
vetor.adiciona(aluno3);


System.out.println(vetor.tamanho());
System.out.println(vetor.contem(aluno));
System.out.println(vetor.contem(aluno2));
System.out.println(vetor.contem(aluno3));



}

}

