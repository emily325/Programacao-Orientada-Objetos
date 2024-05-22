public class Aluno {
    String nome;
    int idade;
    String genero;
    boolean ehestudioso;   

    public void seApresentar(){
    System.out.println(String.format("""
       Aluno: ok, meu nome eh %s e eu tenho %s anos.
     """, nome, idade ));
    }

    public void fazerLicao(){
        if(ehestudioso){
            System.out.println("aluno comeca a fazer a licao.");
        }else{
            System.out.println("aluno nao esta fazendo a licao.");
        }
    }

    public void asssistirAula(){
        if(!ehestudioso){
        System.out.println("aluno nao esta assistindo a aula");
        }else{
            System.out.println("");
        }
    }



    

    
}
