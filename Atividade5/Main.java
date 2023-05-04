package Atividade5;
import java.util.Scanner;
//import Atividade5.LDE;



public class Main {

    public static void main(String[] args) {

        Lista lista = new LDE();

        lista.insereNoInicio(1);
        lista.insereNoFinal(2);

        System.out.println(lista.getListaInicio());
        System.out.println(lista.getListaFim());

    }
    
}