import escola.Aluno;
import escola.Professor;
import escola.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("3045725", null, null);
        Professor professor  = new Professor("Historia", null, null);
       
        aluno.exibirInfo();
        aluno.exibirInfo(false, true, false);
        System.out.println();

        professor.exibirInfo();
        professor.exibirInfo(true, true, false);
    }
}
