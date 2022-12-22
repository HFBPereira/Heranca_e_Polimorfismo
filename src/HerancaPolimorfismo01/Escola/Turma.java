package HerancaPolimorfismo01.Escola;

public class Turma {
    private final String nome;
    private Integer quantidadeAlunos;

    public Turma(String nome, Integer quantidadeAlunos) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getNome() {
        return nome;
    }
    public Integer getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    public void setQuantidadeAlunos(Integer quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Quantidade de Alunos: %d", nome, quantidadeAlunos);
    }
}
