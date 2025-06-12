package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class CursoController {
    private List<Curso> cursos;

    public CursoController() {
        cursos = new ArrayList<>();
    }

    public void cadastrarCurso(String tituloCurso, String nomeInstrutor, List<Aula> aulas)
            throws CampoObrigatorioException {
        if (tituloCurso == null || tituloCurso.isBlank()) {
            throw new CampoObrigatorioException("O título do curso é obrigatório.");
        }
        if (nomeInstrutor == null || nomeInstrutor.isBlank()) {
            throw new CampoObrigatorioException("O nome do instrutor é obrigatório.");
        }

        Instrutor instrutor = new Instrutor(nomeInstrutor);
        Curso curso = new Curso(tituloCurso, instrutor);

        if (aulas != null) {
            for (Aula aula : aulas) {
                curso.adicionarAula(aula);
            }
        }

        cursos.add(curso);
    }

    public List<Curso> listarCursos() {
        return cursos;
    }

    public Curso buscarCursoPorNome(String nome) throws CursoNaoEncontradoException {
        for (Curso curso : cursos) {
            if (curso.getTitulo().equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        throw new CursoNaoEncontradoException("Curso \"" + nome + "\" não encontrado.");
    }

    public void removerCurso(String nome) throws CursoNaoEncontradoException {
        Curso curso = buscarCursoPorNome(nome);
        cursos.remove(curso);
    }
}
