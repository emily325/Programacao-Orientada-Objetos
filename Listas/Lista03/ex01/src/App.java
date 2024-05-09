import java.util.Scanner;

public class App {
    static Scanner SCAN = new Scanner(System.in);
    static final int ano = 2024;
    public static void main(String[] args){
       System.out.println("Digite o ano em que voce nasceu");
       int anoDeNascimento= Integer.parseInt(SCAN.nextLine());
       System.out.println("Ate o final do ano de 2024 voce tera " + retornarIdade(anoDeNascimento) + " anos");
    }

    public static int retornarIdade(int anoDeNascimento){
        int idade = ano - anoDeNascimento;
        return idade;
    }
}
