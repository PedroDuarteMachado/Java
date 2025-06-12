package view;

import controller.CursoController;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CursoController controller = new CursoController();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- Sistema de Gestão de Cursos Online ---");
            System.out.println("1. Cadastrar curso");
            System.out.println("2. Listar cursos");
            System.out.println("3. Buscar curso por nome");
            System.out.println("4. Remover curso");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> cadastrarCurso();
                case 2 -> listarCursos();
                case 3 -> buscarCurso();
                case 4 -> removerCurso();
                case 0 -> System.out.println("Encerrando o sistema.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void cadastrarCurso() {
        try {
            System.out.print("Título do curso: ");
            String titulo = scanner.nextLine();

            System.out.print("Nome do instrutor: ");
            String nomeInstrutor = scanner.nextLine();

            List<Aula> aulas = new ArrayList<>();
            String continuar;

            do {
                System.out.print("Título da aula: ");
                String tituloAula = scanner.nextLine();
                System.out.print("Descrição da aula: ");
                String descricaoAula = scanner.nextLine();

                Aula aula = new Aula(tituloAula, descricaoAula);
                aulas.add(aula);

                System.out.print("Deseja adicionar outra aula? (s/n): ");
                continuar = scanner.nextLine();
            } while (continuar.equalsIgnoreCase("s"));

            controller.cadastrarCurso(titulo, nomeInstrutor, aulas);
            System.out.println("Curso cadastrado com sucesso!");

        } catch (CampoObrigatorioException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarCursos() {
        List<Curso> cursos = controller.listarCursos();
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
        } else {
            for (Curso curso : cursos) {
                curso.exibir();
                System.out.println("------------");
            }
        }
    }

    private static void buscarCurso() {
        System.out.print("Digite o nome do curso: ");
        String nome = scanner.nextLine();

        try {
            Curso curso = controller.buscarCursoPorNome(nome);
            curso.exibir();
        } catch (CursoNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void removerCurso() {
        System.out.print("Digite o nome do curso a remover: ");
        String nome = scanner.nextLine();

        try {
            controller.removerCurso(nome);
            System.out.println("Curso removido com sucesso.");
        } catch (CursoNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
