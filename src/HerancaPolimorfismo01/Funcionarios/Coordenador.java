package HerancaPolimorfismo01.Funcionarios;

import HerancaPolimorfismo01.Escola.Turma;

public class Coordenador extends Funcionario {
    public Coordenador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void alocarProfessor(Professor professor, Turma turma) {
        professor.alocarTurma(turma);
    }
}
