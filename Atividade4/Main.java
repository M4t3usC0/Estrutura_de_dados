package Atividade4;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

      Lista lista = new LSE();

        System.out.println(lista.verificaSeEstaVazia());
        lista.insereInicio(0);
        System.out.println(lista.verificaSeEstaVazia());
        lista.remover(0);
        System.out.println(lista.verificaSeEstaVazia());

        lista.inserefinal(1);
        lista.insereInicio(2);
        lista.inserefinal(3);
        lista.inserefinal(4);
        System.out.println(lista.imprimir());
        System.out.println(lista.verificaSeEstaVazia());
        System.out.println(lista.tamanho());

        lista.remover(4);
        System.out.println(lista.imprimir());
        System.out.println(lista.tamanho());
    }   
}
