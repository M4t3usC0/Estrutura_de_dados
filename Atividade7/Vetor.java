package Atividade7;

public class Vetor {
    

        private int[] vetor;
        private int total;


        public Vetor(int tamanho){
            vetor = new int[tamanho];
            total = 0;


        }

        public void adiciona(int numero) {
            vetor[total] = numero;
            total++;
        }


        public boolean contem(int numero) {
            for (int i = 0; i < total; i++) {
                if (vetor[i] == numero) {
                    return true;
                } 
            }
            return false;
        }

        public int getTamanho() {
            return total;
        }

        public int maximoRecursiva() {
            return maximoRecursiva(vetor, 0, total - 1);
        }

        private int maximoRecursiva(int[] vetor, int inicio, int fim) {
            if(inicio == fim) {
                return vetor[inicio];
            } else {
                int meio = (inicio + fim) / 2;
                int max1 = maximoRecursiva(vetor, inicio, meio);
                int max2 = maximoRecursiva(vetor, meio + 1, fim);
                if(max1 > max2) {
                    return max1;
                } else {
                    return max2;
                }
            }
        }      
        
        public int maximoIterativa() {
            int maior = vetor[0];
    
            for(int i = 0; i < vetor.length; i++) {
                if(maior < vetor[i]) {
                    maior = vetor[i];
                }
            }
            return maior;
        }



}
