package Questão1;


import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);



System.out.print("Digite a dimensão do vetor: ");
int n = sc.nextInt();

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

int[] arr3 = getIntersection(arr1, arr2);

System.out.println("A interseção entre os dois vetores é: ");
for (int i = 0; i < arr3.length; i++) {
    System.out.print(arr3[i] + " ");
}

sc.close();
}

public static int[] getIntersection(int[] arr1, int[] arr2) {
int n = arr1.length;
int[] arr3 = new int[n];
int k = 0;

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (arr1[i] == arr2[j]) {
            arr3[k] = arr1[i];
            k++;
            break;
        }
    }
}

int[] intersection = new int[k];
System.arraycopy(arr3, 0, intersection, 0, k);

return intersection;
}

}
