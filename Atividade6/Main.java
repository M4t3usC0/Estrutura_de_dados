package Atividade6;
import java.util.Scanner;


public class Main{

public static void main(String[] args) {

Lista lista = new LDE();
Aluno aluno1 = new Aluno("Gabriel",20,10);
Aluno aluno2 = new Aluno("Mudinho",20,10);
Aluno aluno3 = new Aluno("Pedro",20,10);
Aluno aluno4 = new Aluno("Mateus",20,10);
Aluno aluno5 = new Aluno("Tales",20,10);
Aluno aluno6 = new Aluno("Maria", 15, 9);
Aluno aluno7 = new Aluno("Joao", 18, 8);

lista.insereNoInicio(aluno1);
lista.insereNoInicio(aluno2);
lista.insereNoInicio(aluno3);
lista.insereNoInicio(aluno4);


lista.remover(aluno2);
lista.remover(aluno4);


System.out.println(lista.listaInicio());


}
}

