import java.util.Scanner;

import loja.Produto;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            try{
                Produto produto = new Produto(
                  SCAN.nextLine(),
                  Double.parseDouble(SCAN.nextLine())
                );
                System.out.println(produto.getNome());
                System.out.println(produto.getPreco());
                break;
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(true);
    }
}
