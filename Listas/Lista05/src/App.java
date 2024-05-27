import java.util.ArrayList;

import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja("Mercado dantas", 56737561);
        Produto produto = new Produto("detergente", 4.99, false, true);
        
        loja.adicionarProduto(produto);
        loja.verProdutos();
    }
}
