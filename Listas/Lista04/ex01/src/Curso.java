public class Curso {
   String nome;
   int materias;
   int duracao;
   double nota;
   boolean horarioDaAula;

   public void exibirDados(){
     System.out.println(String.format("""
       Curso: %s
       Materias: %s
       Duracao: %s anosçç
     """, nome, materias, duracao));
   }
    public void iniciarAula(){
        if(horarioDaAula){
        System.out.println("Aula se inicializou!");
        }else{
            System.out.println("Aula ainda nao iniciou.");
        }
    }

   public void avaliar(){
    if(nota < 5){
      System.out.println("aluno esta reprovado");
    }else{
      System.out.println("aluno aprovado");
    }
   }

  

   
}
