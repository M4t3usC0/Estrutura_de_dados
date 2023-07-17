package Atividade11;

public class Main {

    public static void main(String[] args) {

        FilaLista<Integer> fila = new FilaLista<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        System.out.println(fila.toString());

        fila.remove();
        fila.remove();

        System.out.println(fila.toString());

        System.out.println(fila.size());

    }
    
}
