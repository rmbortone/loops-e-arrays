package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

// modificação acrescentada colocando nome e sitação do aluno
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        String nome;
        String aprovado = ("Aluno aprovado!");
        String recuperacao = ("Aluno deve fazer recuperação!");
        String reprovado = ("Aluno reprovado!");
        String resposta;

        while (true){ //entrada do nome do aluno
            System.out.println("Nome do aluno: ");
                nome = scan.next();
            System.out.println ("O nome do aluno é: " + nome + "?");
                resposta = scan.next();
                if (resposta.equals ("S")) break; // confirmando o nome do aluno
        }

        while (true){ // entrada da nota do aluno
            System.out.println("Nota do aluno: ");
                nota = scan.nextInt();
            if (nota < 0 || nota > 10){  // Limitando a nota de 0 à 10
                System.out.println("Valor inválido! Favor escolher valores de 0 à 10.");
             nota = scan.nextInt();
            }
            else { //confirmando a nota do aluno
                System.out.println("A nota do aluno " + nome + " é " + nota + "?");
                resposta = scan.next();
                if (resposta.equals ("S")) break;
            }
        }
        
        while (true){ // situação do aluno de aprovado, recuperação ou reprovado
            if (nota >= 7) {
                System.out.println( "A nota do aluno " + nome + " é " + nota +". " + aprovado);
                break;
            }
            else if (nota <= 5) {
                System.out.println ("A nota do aluno " + nome + " é " + nota +". " + reprovado);
                break;
            }
            else {
                System.out.println ( "A nota do aluno " + nome + " é " + nota +". " + recuperacao); 
                break;
            }
        }
    }     
}
