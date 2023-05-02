package Atividade1;
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

