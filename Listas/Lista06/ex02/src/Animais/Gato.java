package Animais;

public class Gato implements Animal {
    private String nome;
    private int idade;

    public Gato(String nome){
       this.nome = nome;
    }

    public void comer(){
        System.out.println("o gato esta comendo");
    }

    public void emitirSom(){
        System.out.println("miauu! miau!");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
