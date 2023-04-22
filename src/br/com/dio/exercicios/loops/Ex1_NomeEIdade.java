package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        String resposta;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Seus dados estão corretos?");
            resposta = scan.next();
            if (resposta.equals ("Sim")) break; 
        }

        System.out.println("Seu nome: " + nome + " Sua idade: " + idade);

    }

}
