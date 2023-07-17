package Atividade14;

public class Main {

    public static void main(String[] args) {

        MapaHashLSE mapa = new MapaHashLSE();

        Aluno a1 = new Aluno(1, "Pedro");
        mapa.put(a1.getMatricula(), a1);

        Aluno a2 = new Aluno(2, "Vitor");
        mapa.put(a2.getMatricula(), a2);

        Aluno a3 = new Aluno(3, "Mateus");
        mapa.put(a3.getMatricula(), a3);

        Aluno a4 = new Aluno(4, "Carlos");
        mapa.put(a4.getMatricula(), a4);

        Aluno a5 = new Aluno(5, "Ana");
        mapa.put(a5.getMatricula(), a5);

        Aluno a6 = new Aluno(6, "Jose");
        mapa.put(a6.getMatricula(), a6);

        Aluno a7 = new Aluno(7, "João");
        mapa.put(a7.getMatricula(), a7);

        Aluno a8 = new Aluno(8, "Maria");
        mapa.put(a8.getMatricula(), a8);

        Aluno a9 = new Aluno(9, "Gabriel");
        mapa.put(a9.getMatricula(), a9);

        Aluno a10 = new Aluno(10, "Gabriel");
        mapa.put(a10.getMatricula(), a10);

        Aluno a11 = new Aluno(11, "Gabriel");
        mapa.put(a11.getMatricula(), a11);

        System.out.println(mapa);

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(11));

        System.out.println(mapa.remove(1));

        System.out.println(mapa);


    }
    
}
