import java.util.Scanner;

public class App {
  
    static Scanner SCAN = new Scanner(System.in);
    static final int quantidadeDeCriticos = 3;
    static int[] notas = new int[quantidadeDeCriticos];
  
    public static void main(String[] args) throws Exception {
      receberNotas();
      imprimirMediaDoFilme();
    }

    public static void receberNotas(){
       for(int i = 0; i < quantidadeDeCriticos; i++){
         notas[i] = Integer.parseInt(SCAN.nextLine());
       }
    }

    public static void imprimirMediaDoFilme(){
        int somaNotas = 0;
        for(int i = 0; i < quantidadeDeCriticos; i++){
            somaNotas += notas[i];
        }
        int media = somaNotas / quantidadeDeCriticos;
        System.out.println(media);
       
    }
}
