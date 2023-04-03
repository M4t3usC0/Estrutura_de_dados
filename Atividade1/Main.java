package Atividade1;
import java.util.Scanner;


public class Main{

public static void main(String[] args) {

    Vetor vetor = new Vetor();
Aluno aluno1 = new Aluno("Gabriel",20,10);
Aluno aluno2 = new Aluno("Mudinho",20,10);
Aluno aluno3 = new Aluno("Pedro",20,10);
Aluno aluno4 = new Aluno("Mateus",20,10);
Aluno aluno5 = new Aluno("Tales",20,10);
Aluno aluno6 = new Aluno("Maria", 15, 9);
Aluno aluno7 = new Aluno("Joao", 18, 8);

vetor.adiciona(aluno1);
vetor.adiciona(aluno2);
vetor.adiciona(aluno3);
vetor.adiciona(aluno4);
vetor.adiciona(aluno5);
vetor.adiciona(aluno6);
vetor.adiciona(aluno7);

vetor.remove(aluno2);
vetor.remove(aluno4);


// System.out.println(vetor.tamanho());
// System.out.println(vetor.contem(aluno));
// System.out.println(vetor.contem(aluno2));
// System.out.println(vetor.contem(aluno3));

System.out.println(vetor.exibeTodos());


}

}

