import java.util.List;

import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme("Escritores da liberdade", "Richar LaGravenese", List.of("Hilary", "Jason"));
        Jogo jogo = new Jogo("Overcooked", "videogames e computador");
    
        Locadora <AudioVisual> locadora = new Locadora<AudioVisual>();
        locadora.adicionarItem(jogo);
        locadora.adicionarItem(filme);
        locadora.listarItens();

        AudioVisual buscandoItem = locadora.buscarItem("Escritores da liberdade");
        if(buscandoItem != null){
            System.out.println("Titulo encontrado");
            buscandoItem.exibirInfo();
        }else {
            System.out.println("Titulo nao encontrado");
        }
        locadora.buscarItem("Escritores da liberdade");
    }
}
