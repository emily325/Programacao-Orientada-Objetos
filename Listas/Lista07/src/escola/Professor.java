package escola;

public class Professor extends Usuario{
    private String disciplina;

    public Professor(String discplina, String email, String disciplina){
    super("Carlos", "carlos_i890");
       this.disciplina = discplina;
    }

    public void exibirInfo(){
        System.out.println(String.format(
        """
        Nome: %s
        email: %s
        Discplina: %s     
        """,
        super.getNome(),
        super.getEmail(),
        disciplina
    ));
    } 

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina){
        if(exibirNome){
            System.out.println(getNome());;
         }
   
         if(exibirEmail){
            System.out.println(getEmail());
         }
   
         if(exibirDisciplina){
            System.out.println(getDisciplina());
         }
   
         return;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
