package eventos;

import java.util.ArrayList;
import java.util.List;

public class Show extends Evento{
   private List<String> artistas = new ArrayList<>();

   public Show(String nome, String local, String data){
      super(nome, local, data);
      artistas.add(new String("bk"));
      artistas.add(new String("Djonga"));
   }

   @Override
   public void exibirInformacoes(){
      System.out.println(String.format(
         """
         Nome: %s
         Local: %s
         Data: %s
         Artistas: %s
            
         """, getNome(), getLocal(), getData(), artistas
      ));
   }
   
   @Override
   public void comecarEvento(){
      System.out.println("O show começou!!");
   }

   public void comecarEvento(boolean comAplausos){
      if(comAplausos){
         System.out.println("as pessoas estao aplaudindo o show");
      }else {
         System.out.println("sem aplausos");
      }
   }

   public List<String> getArtistas() {
      return artistas;
   }
}
