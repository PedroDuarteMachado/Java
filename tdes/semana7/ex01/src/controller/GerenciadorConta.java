package controller;                                                                                  
import java.util.Scanner;                                                                            
import dominio.ContaBancaria;                                                                        


public class GerenciadorConta {                                                                      

	public static void main(String[] args) {                                                         
		Scanner sc = new Scanner(System.in);                                                         
		ContaBancaria conta = new ContaBancaria();                                                   

		int opcao = 0;                                                                               
		while(opcao != 4) {                                                                          
			System.out.println("Qual operação desejaria realizar (Depositar, Sacar, Saldo ou Sair)");
			opcao = sc.nextInt();                                                                    
			switch(opcao) {                                                                          
				case 1 :                                                                             
					System.out.println("Deposito: ");                                                
					conta.depositar(sc.nextDouble());                                                
					break;                                                                           
				case 2:                                                                              
					System.out.println("Saque: ");                                                   
					conta.sacar(sc.nextDouble());                                                    
					break;                                                                           
				case 3:                                                                              
					System.out.println("Saldo: " + conta.exibirSaldo());                             
					break;                                                                           
				case 4:                                                                              
					System.out.println("Saindo do Sistema...");                                      
					break;                                                                           
				default:                                                                             
					System.out.println("Opção Inválida");                                            
			}                                                                                        
		}                                                                                            
		sc.close();                                                                                  
	}                                                                                                

}                    