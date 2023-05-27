package Questão8;

public class Main {

        public static void main(String[] args) {
    
            LDE lista1 = new LDE();
    
            lista1.insereFim(10);
            lista1.insereFim(20);
            lista1.insereFim(30);
            lista1.insereFim(40);
    
            LDE lista2 = new LDE();
    
            lista2.insereFim(50);
            lista2.insereFim(60);
            lista2.insereFim(70);
            lista2.insereFim(80);
    
            lista1.concat(lista2);
    
            System.out.println(lista1.getListaInicio());
        }
        
    }
    
    

