package HerancaPolimorfismo01.Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario {
    private final List<Professor> professoresOrientados = new ArrayList<>();

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void orientarProfessor(Professor professor) {
        professoresOrientados.add(professor);
    }

    public void exibirProfessoresOrientados() {
        if (professoresOrientados.isEmpty()) {
            System.out.printf("Diretor(a) %s não possui professores orientados.%n", nome);
            return;
        }

        System.out.println("Professores orientados pelo(a) diretor(a) " + nome);
        professoresOrientados.forEach(System.out::println);
    }
}
