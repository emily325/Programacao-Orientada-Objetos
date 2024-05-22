public class App{
    public static void main(String[] args) {
       Curso curso = new Curso();
       Professor professor = new Professor();
       Aluno aluno = new Aluno();
       

       curso.nome = "Tecnico em enfermagem";
       curso.materias = 18;
       curso.duracao = 2;
       curso.horarioDaAula = true;
       curso.nota = 4;

       professor.nome = "Sergio";
       professor.idade = 29;
       professor.disciplina = "Anatomia Humana";

       aluno.nome = "joao";
       aluno.idade = 20;
       aluno.ehestudioso = false;
       aluno.genero = "masculino";

       curso.exibirDados();
       curso.iniciarAula();
       professor.entrarSala();
       professor.seApresentar();
       aluno.seApresentar();
       professor.darAula();
       aluno.fazerLicao();
       aluno.asssistirAula();
       curso.avaliar();

       

      
    }
}