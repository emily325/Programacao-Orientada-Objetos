package Animais;

public class Cachorro implements Animal{
    private String nome;
    private int idade;
    private double peso;

    public Cachorro(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(){
        System.out.println("o cachorro esta comendo");
    }

    public void emitirSom(){
        System.out.println("au! au! au!");
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }


}
