public class Professor {
    String nome;
    int idade;
    String disciplina;

    public void entrarSala(){
        System.out.println("professor entrou na sala");
    }

    public void seApresentar(){
      System.out.print(String.format("""
        Professor: oi meu nome eh %s, eu tenho %s anos e vou dar a disciplina de %s a voce
      """, nome, idade, disciplina  ));
    }

    public void darAula(){
        System.out.println("professor comeca a explicar a materia");
    }


}
