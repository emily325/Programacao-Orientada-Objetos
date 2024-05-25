package loja;
public class Produto {
    private String nome;
    private double preco;
    private Integer codigo;
    private boolean validade;
    private boolean foivendido = false;


    public Produto(String nome, double preco, boolean foivendido){
        this.nome = nome;
        this.preco = preco;
        this.foivendido = foivendido;
    }

    public void verificarValidade(){
        if(validade){
            System.out.println("Produto esta na validade");
        }else{Lista
            System.out.println("Produto esta fora da validade, nao podera ser comprado");
            return;
        }
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
}
