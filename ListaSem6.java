package controller;
import java.util.Scanner;


public class ListaSem6 {

	public static void main(String[] args) {
		
		
		//1- 
		/*
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o número N: ");
	        int N = sc.nextInt();

	        int soma = 0;
	        for (int i = 1; i <= N; i++) {
	            soma += i;
	        }

	        System.out.println("A soma dos primeiros " + N + " números naturais é: " + soma);
	        sc.close();
		*/
		
		//2-
		/*
		   Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        int contador = 1;
        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }

        sc.close();
		 */
		//3-
		/*
		 Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo para iniciar a contagem regressiva: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            do {
                System.out.println(numero);
                numero--;
            } while (numero >= 0);
        } else {
            System.out.println("Por favor, insira um número positivo.");
        }

        sc.close();
		 */
		
		
		//4-
		
		/*
		  Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int numAlunos = sc.nextInt();

        double somaNotas = 0;
        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / numAlunos;
        System.out.println("A média da turma é: " + media);

        sc.close();
		 */
		
		//5-
	
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos no intervalo: ");
        for (int num = inicio; num <= fim; num++) {
            boolean primo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo && num > 1) {
                System.out.println(num);
            }
        }

        sc.close();
		 
		
		
	}

}
