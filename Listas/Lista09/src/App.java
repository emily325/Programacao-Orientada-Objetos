
import eventos.Evento;
import eventos.Show;
import eventos.Stand_up;

public class App {
    public static void main(String[] args) throws Exception {
        Show show = new Show("festival 2024", "sao paulo, guarulhos", "15/09");
        Stand_up stand_up = new Stand_up("modo efetivo", "sao paulo", "30/06", "thiago ventura");
    
        show.comecarEvento();
        show.comecarEvento(true);
        System.out.println();
        show.exibirInformacoes();
         
        stand_up.comecarEvento();
        stand_up.comecarEvento("porque o livro de matematica parece tao triste? por causa de todos os seus problemas");
        System.out.println();
        stand_up.exibirInformacoes();
    }
}
