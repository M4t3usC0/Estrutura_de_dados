package Atividade15;

public class Main {

    public static void main(String[] args) {
        

        ABB arvore = new ABB();

        arvore.recursiveAdd(12);
        arvore.recursiveAdd(20);
        arvore.recursiveAdd(3);
        arvore.recursiveAdd(5);
        arvore.recursiveAdd(14);
        arvore.recursiveAdd(16);
        arvore.recursiveAdd(8);

        arvore.add(10);


        arvore.imprime();

    }

}
