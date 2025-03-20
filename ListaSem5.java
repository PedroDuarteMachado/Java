package controller;
import java.util.Scanner;

public class ListaSem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 
		
		/*	Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = sc.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
	        } else {
	            System.out.println("O número é ímpar.");
	        }

	        sc.close();
		
		
		*/
		//2.
		
		/*
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade.");
        } else if (idade >= 18 && idade <= 60) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso.");
        }

        sc.close();*/
		
		//3.
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                sc.close();
                return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
        
        */
		
		//4
		/*
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }

        sc.close();
        */
		
		//5

		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
        } else {
            char conceito;
            if (nota >= 9) {
                conceito = 'A';
            } else if (nota >= 7) {
                conceito = 'B';
            } else if (nota >= 5) {
                conceito = 'C';
            } else if (nota >= 3) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }
            System.out.println("Conceito: " + conceito);
        }

        sc.close();
       
		
		
		

	}

}
