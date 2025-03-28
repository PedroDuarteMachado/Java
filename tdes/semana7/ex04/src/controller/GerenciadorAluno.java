package controller;

import dominio.Aluno;
import java.util.Scanner;

public class GerenciadorAluno {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Aluno aluno = new Aluno();

            System.out.print("Digite o nome do aluno: ");
            aluno.setNome(sc.nextLine());

            while (true) {
                System.out.print("Digite a nota do aluno: ");
                aluno.setNota(sc.nextDouble());

                if (aluno.validarNota()) {
                    aluno.classificarAluno();
                    break;
                } else {
                    System.out.println("Nota inválida!");
                }
            }
        } catch (Exception e) {
            System.out.println("Digite um valor válido!");
        }
    }
}