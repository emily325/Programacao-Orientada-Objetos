import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
         do{

         try {
            BibliotecaMusical biblioteca = new BibliotecaMusical();
            Musica musica = new Musica("me desculpa jayz", "baco exu do blues", "bluesman");
            Musica musica1 = new Musica("solto", "Djonga", "o menino que queria ser deus");
            biblioteca.adicionarMusica("me desculpa jayz ", musica);
            biblioteca.adicionarMusica("solto", musica1);
   
            System.out.println("musicas disponiveis:");
            biblioteca.listarMusicas();
            biblioteca.buscarMusica("fairy tale");
            biblioteca.buscarMusica("solto");
            break;
          
         } catch (Exception e) {
            System.out.println(e.getMessage());
            break;
         }
        }while (true);
    }
}