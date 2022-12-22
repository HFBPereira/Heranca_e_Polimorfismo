package HerancaPolimorfismo01.Escola;

public class Agenda {
    private String titulo;
    private String descricao;

    public Agenda(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return String.format("Titulo: %s%nDescricao: %s", titulo, descricao);
    }
}
