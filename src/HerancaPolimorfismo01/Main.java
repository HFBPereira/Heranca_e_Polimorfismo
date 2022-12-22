package HerancaPolimorfismo01;

import HerancaPolimorfismo01.Escola.Agenda;
import HerancaPolimorfismo01.Escola.Artigo;
import HerancaPolimorfismo01.Escola.Turma;
import HerancaPolimorfismo01.Funcionarios.Coordenador;
import HerancaPolimorfismo01.Funcionarios.Diretor;
import HerancaPolimorfismo01.Funcionarios.Professor;
import HerancaPolimorfismo01.Funcionarios.Secretario;
import HerancaPolimorfismo01.Sup.Imprima;

public class Main {
    public static void main(String[] args) {
        Professor profGabi = new Professor("Gabriela", "123.456.789-00", 10d);
        Diretor dirThiago = new Diretor("Thiago", "123.456.789-00", 10d);
        Coordenador cooLaura = new Coordenador("Laura", "123.456.789-00", 10d);
        Secretario secHenri = new Secretario("Henrique", "123.456.789-00", 10d);

        Artigo artigoJava = new Artigo("Java", "Java é uma linguagem de programação orientada a objetos");
        Agenda agendaGabi = new Agenda("Agenda de Gabi", "Descrição da agenda de Gabi");
        Turma turmaA = new Turma("Turma A", 10);

        Imprima.divisoria();
        profGabi.publicarArtigo(artigoJava);
        profGabi.exibirArtigosPublicados();
        Imprima.divisoria();

        cooLaura.alocarProfessor(profGabi, turmaA);
        profGabi.exibirTurmasPeriodo();
        Imprima.divisoria();

        dirThiago.orientarProfessor(profGabi);
        dirThiago.exibirProfessoresOrientados();
        Imprima.divisoria();

        secHenri.cadastrarAgenda(profGabi, agendaGabi);
        secHenri.listarAgenda(profGabi);
        Imprima.divisoria();
    }
}
