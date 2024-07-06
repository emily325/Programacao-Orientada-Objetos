
import java.util.HashMap;
import java.util.Map;

public class BibliotecaMusical{
    Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(String titulo, Musica musica){
        acervo.put(titulo, musica);
    }

    public void listarMusicas(){
        for (Musica musicas : acervo.values()) {
            System.out.println(musicas);
        }
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
          for (Musica musica : acervo.values()) {
              if(musica.getTitulo().equalsIgnoreCase(titulo)){
                return this.acervo.get(titulo);
              }
           }
        throw new MusicaNaoEncontradaException();
    }

    public Map<String, Musica> getAcervo() {
        return acervo;
    }
}