package loja;
public class Produto {
    private String nome;
    private double preco;
    private Integer codigo;
    private boolean estaNaValidade ;
    private boolean foivendido;


    public Produto(String nome, double preco, boolean foivendido, boolean estaNaValidade){
        this.nome = nome;
        this.preco = preco;
        this.foivendido = foivendido;
        this.estaNaValidade = estaNaValidade;
    }


    public String getnome(String nome){
        return this.nome;
    }

    public void setpreco(Double preco){
      this.preco = preco;
    }

    public Integer getcodigo(Integer codigo){
        return this.codigo;
    } 

    public boolean getfoivendido(){
       return this.foivendido;
    }

    public void setfoivendido(boolean foivendido){
        this.foivendido = foivendido;
    }

    public boolean getestaNaValidade(){
        return this.estaNaValidade;
    }

    public void setestaNaValidade(boolean estaNaValidade){
       this.estaNaValidade = estaNaValidade;
    }

}
