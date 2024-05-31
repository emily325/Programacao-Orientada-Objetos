import Animais.Cachorro;
import Animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
       Gato gato = new Gato("Tom");
       Cachorro cachorro = new Cachorro("Romeu", 40.2);

       gato.emitirSom();
       cachorro.emitirSom();
       
    }

}
