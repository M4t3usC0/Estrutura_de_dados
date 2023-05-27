package Questão5;


public class Main {

    public static void main(String[] args) {

        Lista lista = new LDE();

        lista.insereInicio(1);
        lista.insereInicio(2);
        lista.insereInicio(3);
        lista.insereInicio(4);
        lista.insereInicio(5);
        lista.insereInicio(6);
        lista.insereInicio(7);
        lista.insereInicio(8);
        lista.insereInicio(9);
        lista.insereInicio(10);

        System.out.println("Numeros pares quantidade: " + lista.nroPares());
    }
    
}