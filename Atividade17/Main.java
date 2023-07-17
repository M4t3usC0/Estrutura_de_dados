package Atividade17;

public class Main {
    public static void main(String[] args) {

        AVL arvoreAVL = new AVL();

        
        arvoreAVL.add(19, arvoreAVL.getRaiz());
        arvoreAVL.add(11, arvoreAVL.getRaiz());
        arvoreAVL.add(45, arvoreAVL.getRaiz());
        arvoreAVL.add(79, arvoreAVL.getRaiz());
        arvoreAVL.add(51, arvoreAVL.getRaiz());
        arvoreAVL.add(57, arvoreAVL.getRaiz());
        arvoreAVL.add(98, arvoreAVL.getRaiz());
        arvoreAVL.add(52, arvoreAVL.getRaiz());
        arvoreAVL.add(77, arvoreAVL.getRaiz());
        arvoreAVL.add(33, arvoreAVL.getRaiz());

        arvoreAVL.isArvoreBalanceada(arvoreAVL.getRaiz());
       
        if (arvoreAVL.isArvoreBalanceada(arvoreAVL.getRaiz())) {
            System.out.println("Balanceada");
        }

    }

}
