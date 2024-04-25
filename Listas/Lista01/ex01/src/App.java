import java.util.Scanner;

public class App {
  private static final int TAMANHO_VETOR = 10;

  private static final Scanner Ler = new Scanner(System.in);
   public static void main(String[] args) {
     int[] num = new int[TAMANHO_VETOR];
     preencherVetor(num);
     verificacao(num);
   }

   public static void preencherVetor(int[] num){
    for(int i = 0; i < num.length; i++){
      num[i] = Integer.parseInt(Ler.nextLine());
    }
  }

   public static void verificacao(int[] num){
    int novoNumero = Integer.parseInt(Ler.nextLine());
    boolean encontrei = false;

    for(int i = 0; i < num.length; i++){
     if(num[i] == novoNumero){
        encontrei = true;
        break;
     }  
    } 

    if(encontrei){
      System.out.println("ACHEI");
    }else{
      System.out.println("NAO ACHEI");
    }
  }
}
  