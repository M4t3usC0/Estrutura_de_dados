package Atividade4;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Array array = new LSE();

        System.out.println(lista.estahVazia());

        lista.insereInicio(0);

        System.out.println(lista.estahVazia());

        lista.remove(0);

        System.out.println(lista.estahVazia());

        lista.insereFim(1);
        lista.insereInicio(2);
        lista.insereFim(3);
        lista.insereFim(4);
        System.out.println(lista.imprimirLista());
        System.out.println(lista.estahVazia());
        System.out.println(lista.tamanho());

        lista.remove(3);
        System.out.println(lista.imprimirLista());
        System.out.println(lista.tamanho());
    }   
}
