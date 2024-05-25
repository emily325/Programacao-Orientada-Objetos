package loja;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private String cliente;
    private String funcionario;
    private int cep;
    private boolean horarioComercial;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(String cliente, String funcionario){
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public void abrirLoja(){
        if(horarioComercial){
          System.out.println("A loja esta aberta");
        }else{
            System.out.println("A loja ainda nao esta aberta");
            return;
        }
    }

    public void comprarProduto(boolean foivendido){
        if(foivendido = true){
            System.out.println("produto pode ser comprado");
        }else{
            System.out.println("produto ja foi vendido");
            return;
        }
    }
    
    public void setcliente(String cliente){
       this.cliente = cliente;
    }

    public void setfuncionario(String funcionario){
        this.funcionario = funcionario;
    }

    public void setcep(int cep){
        this.cep = cep;
    }

}
