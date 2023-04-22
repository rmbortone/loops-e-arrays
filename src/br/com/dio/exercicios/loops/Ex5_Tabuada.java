package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

// o usuário poderá escolher tabuada de qual numero e qual o tamanho da tabuada

public class Ex5_Tabuada {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double numeroEscolhido;
        double contador = 0;
        double tabuada = 0;

        System.out.println("Tabuada de qual numero: ");
        numeroEscolhido = scan.nextInt();
        System.out.println( "Qual o tamanho da tabuada?");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + numeroEscolhido);
        for(contador = 0; contador <= tabuada; contador = contador + 1) {
            System.out.println(numeroEscolhido+ " X " + contador + " = " + (contador*numeroEscolhido));
        }
    }

}
