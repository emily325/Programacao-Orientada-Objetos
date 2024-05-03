import java.util.Scanner;
public class App{

static final int quantidadePerguntas = 3;
static final String[] respostaUsuario = new String[quantidadePerguntas];
static final String[] gabarito = new String[quantidadePerguntas];
static final Scanner SCAN = new Scanner(System.in);

  public static void main(String[] args) {
    String nomeParticipante = receberNome();
    formatarNome(nomeParticipante);
    começarQuiz(nomeParticipante);
    pergunta1(nomeParticipante);
    pergunta2(nomeParticipante);
    pergunta3(nomeParticipante);
    mostrarResultado(nomeParticipante);
  }

  public static String receberNome(){
    System.out.println(
      """
      Veja o quanto você conhece de Brooklyn Nine-Nine!!
      Para começar o quiz
      digite seu nome:
      """
      );
      return formatarNome(SCAN.nextLine());
  }

  public static String formatarNome(String nome){
    if(nome.isBlank()){
      return "Nome não inserido";
    }

    nome = nome.trim();
    String[] nomeCompleto = nome.split(" ");
    String primeiroNome = nomeCompleto[0];
    String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
    String primeiroNomesemInicial = primeiroNome.substring(1);
    String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomesemInicial.toLowerCase();
    return nomeFormatado;
  }

  public static void começarQuiz(String nomeParticipante){
    System.out.println(String.format(
      """
       Olá %s !!
       Antes de iniciarmos o quiz saiba que caso a letra da alternativa for diferente das opções disponíveis
       será considerado errado.

       Aperte 'Enter' para começar
      """,
        nomeParticipante
    ));

    SCAN.nextLine();
  }

  public static void pergunta1(String nome){
    String resposta = "";
    do{
      System.out.println(
        """
         1- Qual profissão da mãe do Holt ?
          A - Advogada
          B - Juiza
          C - Escritora
        """
        );
        resposta = SCAN.nextLine(); 

    }while(!ehUmaRespostaValida(resposta));

    gabarito[0] = "B";
    respostaUsuario[0] = resposta;
  }

  public static void pergunta2(String nome){
    String resposta = "";
    do{
      System.out.println(
        """
         1- Quem ganhou o primeiro roubo no Halloween ?
          A - Jake
          B - Amy
          C - Holt
        """
        );
        resposta = SCAN.nextLine(); 

    }while(!ehUmaRespostaValida(resposta));

    gabarito[1] = "A";
    respostaUsuario[1] = resposta;
  }

  public static void pergunta3(String nome){
    String resposta = "";
    do{
      System.out.println(
        """
         1- Quem ama iourgute na série?
          A - Gina
          B - Scully
          C - Terry
        """
        );
        resposta = SCAN.nextLine(); 

    }while(!ehUmaRespostaValida(resposta));

    gabarito[2] = "C";
    respostaUsuario[2] = resposta;
  }

  public static boolean ehUmaRespostaValida(String resposta){
    if(resposta.isBlank()){
      System.out.println(
        """
        Sua resposta não pode ser vazia
        Vamos enviar a pergunta novamente
        """
      );
      return false;
    }
    return true;
  }

  public static void mostrarResultado(String nomeParticipante){
    System.out.println(String.format(
      """
       %s, Veja quantas perguntas você acertou!
       """,
       nomeParticipante
    
    ));
    for(int i = 0; i < quantidadePerguntas; i++){
    System.out.println(String.format(
      "%s - %s",
      (i + 1),
      respostaUsuario[i].equalsIgnoreCase(gabarito[i]) ? "Acertou" : "Errou"
    ));
  }
 }
}

