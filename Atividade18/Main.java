package Atividade18;

public class Main {
    
    public static void main(String[] args) {

        int[] arrayDesordenado = { 6,4, 3, 5, 8, 9, 1, 7 };

        ArrayOrdenacao ordena = new ArrayOrdenacao();

        System.out.println("Heap Sort");
        ordena.heapSort(arrayDesordenado);

        System.out.println("\nQuick Sort");
        ordena.quickSort(arrayDesordenado);

        

    }

}
