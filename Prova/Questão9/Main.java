package Questão9;

public class Main {

        public static void main(String[] args) {
    
            LSE lse = new LSE();
    
            lse.insereInicio(10);
            lse.insereFim(5);
            lse.insereFim(8);
            lse.insereFim(2);
            lse.insereFim(1);
            lse.insereInicio(7);
    
            lse.bubbleSort();
    
            System.out.println(lse.imprimirLista());
    
        }   
    }
    
    

