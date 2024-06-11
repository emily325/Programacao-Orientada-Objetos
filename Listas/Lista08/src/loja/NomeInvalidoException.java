package loja;

public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("Nome tem que ter mais de dois caracteres");
    }
}
