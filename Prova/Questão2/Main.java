package Questão2;

public class Main	{

public static void main(String[] args) {
    Vetor vetor = new Vetor(5);

    vetor.adiciona(3.2f);
    vetor.adiciona(1.5f);
    vetor.adiciona(4.7f);
    vetor.adiciona(2.9f);
    vetor.adiciona(5.1f);

    vetor.selectionSort();
    vetor.imprime();
}

}
