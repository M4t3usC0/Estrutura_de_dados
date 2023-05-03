package Atividade3;
import java.util.Scanner;


public class Main{

public static void main(String[] args) {

    PontoCartesiano vetor = new PontoCartesiano();
PlanoCartesiano aluno1 = new PlanoCartesiano("Gabriel",20,10);
PlanoCartesiano aluno2 = new PlanoCartesiano("Mudinho",20,10);
PlanoCartesiano aluno3 = new PlanoCartesiano("Pedro",20,10);
PlanoCartesiano aluno4 = new PlanoCartesiano("Mateus",20,10);
PlanoCartesiano aluno5 = new PlanoCartesiano("Tales",20,10);
PlanoCartesiano aluno6 = new PlanoCartesiano("Maria", 15, 9);
PlanoCartesiano aluno7 = new PlanoCartesiano("Joao", 18, 8);

Vetor vetAlunos = new Vetor();
        vetAlunos.adiciona(aluno1);

        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno2));
        System.out.println(vetAlunos.getTamanho());
        System.out.println(vetAlunos.contem(aluno3));
    }  
    
    

    System.out.println(vetor.exibeTodos());

}










