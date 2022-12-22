package HerancaPolimorfismo01.Funcionarios;

import HerancaPolimorfismo01.Escola.Agenda;

public abstract class Funcionario {
    protected final String nome;
    protected final String cpf;
    protected double salario;
    protected Agenda agenda;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, CPF: %s, Salário: %.2f", nome, cpf, salario);
    }
}
