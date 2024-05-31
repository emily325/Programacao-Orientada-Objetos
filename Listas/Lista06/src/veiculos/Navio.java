package veiculos;

public class Navio implements Veiculo{
    private String nome;
    private String material;
    private String marca;
    private String tipoDeBarco;

    public Navio(String marca, String material){
        this.marca = marca;
        this.material = material;
    }

    public void acelerar(int velocidade){
        if(velocidade < 30){
            velocidade += 13;
            System.out.println("vushhhhh");
            System.out.println("navio aumentou a velocidade e esta a " + velocidade + " km/h");  
        }
    }

    public void frear(int velocidade){
        if(velocidade >= 40 ){
            System.out.println("shhhhhhh");
            System.out.println("navio diminuiu a velocidade");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeBarco() {
        return this.tipoDeBarco;
    }
    
    public void setTipoDeBarco(String tipoDeBarco) {
        this.tipoDeBarco = tipoDeBarco;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}