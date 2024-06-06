package escola;

public class Aluno extends Usuario{
   private String matricula;

   public Aluno(String matricula, String email, String nome){
      super("Lucas", "lucas_345@gmail.com");
      this.matricula = matricula;
   }

   @Override
   public void exibirInfo(){
      System.out.println(String.format(
         """
          Nome: %s
          email: %s
          Matriucla: %s     
         """
         ,
         super.getNome(),
         super.getEmail(),
         matricula
         
      ));
   }

   public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula){
      if(exibirNome){
         System.out.println(getNome());;
      }

      if(exibirEmail){
         System.out.println(getEmail());
      }

      if(exibirMatricula){
         System.out.println(getMatricula());
      }

      return;
   }

   public String getMatricula() {
      return this.matricula;
   }

   public void setMatricula(String matricula) {
      this.matricula = matricula;
   }
}
