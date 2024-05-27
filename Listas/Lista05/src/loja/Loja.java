package loja;

import java.util.ArrayList;

public class Loja {
    private String nomeLoja;
    private int cep;
    private boolean horarioComercial = false;
    private ArrayList<Produto> produtos = new ArrayList<>();


    public Loja(String nomeLoja, int cep){
        this.nomeLoja = nomeLoja;
        this.cep = cep;

        produtos.add(new Produto("pao", 4.99, false, true));
        produtos.add(new Produto("sabonete", 7.99, false, true));
        produtos.add(new Produto("cereal", 14.99, false, true));
    }
    public void adicionarProduto(Produto produto){
        if(produto.getfoivendido()){
            System.out.println("ja foi vendido");
            return;
        }

        if(!produto.getestaNaValidade()){
            System.out.println("Produto esta fora da validade, nao podera ser comprado");
            return;
        }

        produto.setfoivendido(true);
        produto.setestaNaValidade(true);
        produtos.add(produto);
    }

    public void verProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto.getnome(nomeLoja));
        }
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
   
    public void setnomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public void setcep(int cep){
        this.cep = cep;
    }
    
    public ArrayList<Produto>getprodutos(){
        return produtos;
    }
}
