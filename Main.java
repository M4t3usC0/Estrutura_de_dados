
import java.util.Scanner;

// Questão 1) Escreva um programa iterativo (Java) que recebe como entrada dois arranjos (dois vetores de inteiros), 
// cada um com n elementos, e devolve como saída a interseção entre os dois. O retorno é outro vetor contendo os elementos 
// comuns a ambos os vetores. Faça a análise de complexidade de seu algoritmo no pior caso e relate no seu PIÁ. 
// 5n^2 + 12n + 12


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        System.out.print("Digite a dimensão do vetor: ");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n];

        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }

        System.out.println("A interseção entre os dois vetores é: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
    
}
