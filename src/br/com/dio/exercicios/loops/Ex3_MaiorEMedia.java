package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior;
        int soma = 0;
        int primeiroNumero;
        int quantidadeDeNumeros;
        int count = 1;

        System.out.println("A média será referente a quantos números?");
            quantidadeDeNumeros = scan.nextInt();

        System.out.println("Digite um número:");
            primeiroNumero = scan.nextInt();
            maior = primeiroNumero;
            soma = primeiroNumero;

        do {
            if (count < (quantidadeDeNumeros - 1))
                System.out.println("Digite o próximo número: " + (count+1) + "º número");
            else {
                System.out.println("Digite o ultimo número");
            }
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < quantidadeDeNumeros);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/quantidadeDeNumeros));

    }
}
