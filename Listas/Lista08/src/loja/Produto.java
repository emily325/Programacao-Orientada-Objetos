package loja;

public class Produto {
   String nome;
   double preco;

   public Produto(String nome, double preco) throws NomeInvalidoException, PrecoInvalidoException{
      setNome(nome);
      setPreco(preco);
   }

   public String getNome(){
      return this.nome;
   }

   public void setNome(String nome)throws NomeInvalidoException{
     if(nome.length() > 2){
       this.nome = nome;
       return;
     }
     
     throw new NomeInvalidoException();
   }

   public double getPreco() {
      return this.preco;
   }

   public void setPreco(double preco) throws PrecoInvalidoException{
     if(preco >= 0){
      this.preco = preco;
      return;
    }

    throw new PrecoInvalidoException();
   }
}