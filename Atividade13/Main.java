package Atividade13;

public class Main {

    public static void main(String[] args) {

        MapaHashVetor mapa = new MapaHashVetor();

        mapa.put(807365841, new Aluno(807365841, "Mateus"));
        System.out.println(mapa);

        mapa.put(478243081, new Aluno(478243081, "Pedro"));
        System.out.println(mapa);

        mapa.put(478824301, new Aluno(478824301, "Pedro"));
        System.out.println(mapa);

        mapa.put(123, new Aluno(123, "Pedro"));
        System.out.println(mapa);

        mapa.remove(123);
        System.out.println(mapa);

        mapa.remove(478243081);
        System.out.println(mapa);

    }
    
}