package model;

public class Aula extends Conteudo {
    private String descricao;

    public Aula(String titulo, String descricao) {
        super(titulo);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibir() {
        System.out.println("Aula: " + getTitulo() + " - " + descricao);
    }
}
