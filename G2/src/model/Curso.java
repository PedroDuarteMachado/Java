package model;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Conteudo {
    private Instrutor instrutor;
    private List<Aula> aulas;

    public Curso(String titulo, Instrutor instrutor) {
        super(titulo);
        this.instrutor = instrutor;
        this.aulas = new ArrayList<>();
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    @Override
    public void exibir() {
        System.out.println("Curso: " + getTitulo());
        System.out.println("Instrutor: " + instrutor.getNome());
        System.out.println("Aulas:");
        for (Aula aula : aulas) {
            aula.exibir();
        }
    }
}
