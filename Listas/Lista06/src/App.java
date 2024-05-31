import veiculos.Carro;
import veiculos.Navio;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro("Toyota", "corola cross");
        carro.setPlaca("POX4G621");

        Navio navio = new Navio("Azamara", "aço");
        navio.setNome("Polar");
        navio.setMaterial("ferro");
        navio.setTipoDeBarco("caiaque");

        System.out.println("Dados do carro: \n"+ "Modelo: " +carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println();
        carro.acelerar(80);
        carro.frear(250);
        
        System.out.println("\nDados do navio:");
        System.out.println("Nome: " + navio.getNome());
        System.out.println("Marca: " + navio.getMarca());
        System.out.println("Material: " + navio.getMaterial());
        System.out.println("Tipo de barco: " + navio.getTipoDeBarco());
        System.out.println();
        navio.acelerar(25);
        navio.frear(40);
    }
}
