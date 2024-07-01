package locadora;

import java.util.ArrayList;
import java.util.List;

public class Filme implements AudioVisual{
   String titulo;
   String diretor;
   List<String> atores = new ArrayList<>();

   public Filme(String titulo, String diretor, List<String> atores){
      this.titulo = titulo;
      this.diretor = diretor;
      this.atores = atores;
   }

   @Override
   public void exibirInfo(){
      System.out.println(String.format(
        """
        Filme: %s
        Diretor: %s
        Atores: %s     
        """,
        getTitulo(), getDiretor(), getAtores()
      ));
   }

   public void setTitulo(String titulo){
      this.titulo = titulo;
   }

   public String getTitulo(){
      return this.titulo;
   }

   public void setDiretor(String diretor){
      this.diretor  = diretor;
   }

   public String getDiretor(){
      return this.diretor;
   }

   public List<String> getAtores() {
      return atores;
   }

}
