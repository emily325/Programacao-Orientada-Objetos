import java.util.Scanner;

public class App {
    private static final int TAMANHO_MATRIZ = 4;
    private static final Scanner Ler = new Scanner(System.in);
   
    public static void main(String[] args){
      boolean[][] matriz = new boolean[TAMANHO_MATRIZ] [TAMANHO_MATRIZ];
      percorrerMatriz(matriz);
      preencherMatriz(matriz);
      imprimirmatriz(matriz);      
    }

    public static void percorrerMatriz(boolean[][] matriz){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                matriz[i][j] = false;
            }
        }
    }

    public static void preencherMatriz(boolean[][] matriz){
        int digito1 = Integer.parseInt(Ler.nextLine());
        int digito2 = Integer.parseInt(Ler.nextLine());

        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
              if(i == digito1 && j == digito2){
                matriz[i][j] = true;
              }
            }
        }
    }

    public static void imprimirmatriz(boolean[][] matriz){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
              if(matriz[i][j] == true){
                System.out.print("|O");
              }else{
                System.out.print("|X");
              } 
            }
            System.out.print("|");
            System.out.println();
        }
    }


}
