public class Main {

    public static void main(String[] args) {

        FilaVet fila = new FilaVet(12);

        // Adicionando elementos à fila
        fila.add(9);
        fila.add(8);
        fila.add(5);
        fila.add(4);
        fila.add(8);
        fila.add(2);
        fila.add(4);
        fila.add(8);
        fila.add(2);
        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println("Elementos na fila:");
        fila.imprimirFila();
        
        // Removendo elementos da fila
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();

        System.out.println("Elementos na fila após remoção:");
        fila.imprimirFila();

        // Adicionando mais elementos à fila
        fila.add(17);
        fila.add(12);

        System.out.println("Elementos na fila após adição:");
        fila.imprimirFila();

        // Removendo mais elementos da fila
        fila.remove();
        fila.remove();
        fila.remove();

        System.out.println("Elementos na fila após nova remoção:");
        fila.imprimirFila();

        // Removendo todos os elementos restantes da fila
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();

        System.out.println("Elementos na fila após remoção total:");
        fila.imprimirFila();

        // Adicionando mais elementos à fila
        fila.add(23);
        fila.add(50);

        System.out.println("Elementos na fila após nova adição:");
        fila.imprimirFila();
    }
}
