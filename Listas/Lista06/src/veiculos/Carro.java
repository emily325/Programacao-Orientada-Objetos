package veiculos;

public class Carro implements Veiculo{
    private String marca;
    private String placa;
    private String modelo;

    public Carro(String marca, String modelo ){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void acelerar(int velocidade){
        if(velocidade < 100){
            velocidade+=50;
            System.out.println("vrumm vrummm");
            System.out.println("carro acelerou e esta a "+ velocidade + " km/h");
        }
    }

    @Override
    public void frear(int velocidade){
        if(velocidade > 200){
            velocidade = 0;
            System.out.println("chiiirrr");
            System.out.println("o carro freou ");
        }
    }     

    public void status(){
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
