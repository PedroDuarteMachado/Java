package controller;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
	//1 -
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite o primeiro número: ");
	        int num1 = sc.nextInt();
	        
	        System.out.print("Digite o segundo número: ");
	        int num2 = sc.nextInt();
	        
	        int soma = num1 + num2;
	        System.out.println("A soma é: " + soma);
	        
	        sc.close();
	        
		
		/*2 -
		 
        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        
        double area = 3.14159 * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
        
        sc.close();*/
		
		
		/*3- 
        
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        
        sc.close();*/
		
		/* 4-
		 
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média aritmética é: " + media);
        
        sc.close();*/
		
		
		/* 5-
		
        
        System.out.print("Digite a idade em anos: ");
        int idade = sc.nextInt();
        
        int dias = idade * 365;
        System.out.println("Você viveu aproximadamente " + dias + " dias.");
        
        sc.close();*/
		
		
		/* 6-
		
        
        System.out.print("Digite o salário bruto: ");
        double salarioBruto = sc.nextDouble();
        
        System.out.print("Digite o valor do desconto do INSS: ");
        double descontoINSS = sc.nextDouble();
        
        double salarioLiquido = salarioBruto - descontoINSS;
        System.out.println("O salário líquido é: " + salarioLiquido);
        
        sc.close();*/
		
		
		/*7-
		
        
        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        
        sc.close();
		 */

		/*8- 
		
		
        
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        
        double volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);
        System.out.println("O volume da esfera é: " + volume);
        
        sc.close();
        
        */
		
		/*9- 
		
		
        
        System.out.print("Digite o valor em reais: ");
        double reais = sc.nextDouble();
        
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = sc.nextDouble();
        
        double dolares = reais / cotacaoDolar;
        System.out.println("O valor em dólares é: " + dolares);
        
        sc.close();*/
		
		
		/*10-
		
		
        
        System.out.print("Digite as coordenadas x1 e y1 do primeiro ponto: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        System.out.print("Digite as coordenadas x2 e y2 do segundo ponto: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("A distância entre os dois pontos é: " + distancia);
        
        sc.close();*/
		
		
		
		
		
		
		
		
	}

}
