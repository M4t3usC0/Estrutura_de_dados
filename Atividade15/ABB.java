package Atividade15;

public class ABB{

    private Noh raiz;

   public ABB(){
    this.raiz = null;
   } 

   

    public Noh getRaiz(){
        return raiz;
    }


    public boolean isEmpty(){
        return raiz == null;
    }


    public void add(int element){
        if (isEmpty()){
            this.raiz = new Noh(element);
        }else{
            Noh aux = this.raiz;
            while (aux != null){
                if (element < aux.valor){
                    if (aux.esq == null){
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }

                    aux = aux.esq;
                }else{
                    if (aux.dir == null){
                        Noh newNode = new Noh (element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
    }

    public void recursiveAdd(int element){
        if(isEmpty()){
            this.raiz = new Noh(element);

        }else{
            recursiveAdd(this.raiz, element);

        }
    }

    private void recursiveAdd(Noh node, int element){
        if (element < node.getValor()){
            if(node.getEsq() == null){
                Noh newNode = new Noh(element);
                node.setEsq(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getEsq(), element);
        }else{
            if (node.getDir() == null){
                Noh newNode = new Noh(element);
                node.setDir(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getDir(), element);
        }
    }

    public Noh busca (int x){
        Noh aux = raiz;
        
        while(aux != null){
            if (x == aux.getValor()){
                return aux;

            }else if (x > aux.getValor()){
                aux = aux.getDir(); 

            }else{
                aux = aux.getEsq();
            }
        }   return null;

    }

    public void imprime (Noh elemento){
       
        if (elemento != null){
        System.out.println(elemento.getValor());
            imprime(elemento.getDir());
            imprime(elemento.getEsq());
       }      

    }
    
    public void imprime (){
        imprime(raiz);

    }


}