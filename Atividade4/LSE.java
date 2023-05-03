package Atividade4;

public class LSE implements Array {

    private Noh inicio;


    public LSE(){
        this.inicio = null;


    }

    @Override

    public void insereNoInicio(Objeto info) {
        Noh novoNoh = new Noh(info);


        if (inicio == null) {
            inicio = novoNoh;
        } else {
            novoNoh.setProximo(inicio);
            inicio = novoNoh;
        }
        
    }

    @Override

    public void insereNofinal(Objeto info) {
        Noh novoNoh = new Noh(info);
        

        if (inicio == null) {
            inicio = novoNoh;
        } else {
            Noh aux = null;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(novoNoh);
        }
    }

    
}
