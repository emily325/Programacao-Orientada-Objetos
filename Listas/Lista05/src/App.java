import java.util.ArrayList;

import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("", 0, false);
        Loja loja = new Loja("maria", "pedro");

        produto.getnome("detergente");
        produto.setpreco(33.99);
        produto.getcodigo(543383828);
        produto.validade(true);

        loja.setcliente(null);
        loja.setfuncionario(null);
        loja.setcep(0);
    }
}
