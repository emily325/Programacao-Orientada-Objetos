package loja;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(){
        super("Preco nao pode ser negativo ou zero");
    }
}
