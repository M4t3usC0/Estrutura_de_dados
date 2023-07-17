package Atividade12;

public class Main {

    public static void main(String[] args) {

        FilaLista fila = new FilaLista();

        Aluno aluno1 = new Aluno("Pedro", 22, 17);
        Aluno aluno2 = new Aluno("João", 33, 6);

        fila.add(aluno1);
        fila.add(aluno2);

        System.out.println(fila.toString());
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());

        fila.remove();
        fila.remove();

        System.out.println(fila.toString());
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());

    }
    
}