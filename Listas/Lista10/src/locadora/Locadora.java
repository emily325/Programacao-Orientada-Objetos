package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    List<T> acervo = new ArrayList<>();

    public void adicionarItem(T item){
        acervo.add(item);
    }

    public void listarItens(){
        for (T item : acervo) {
            item.exibirInfo();
        }
    }

    public T buscarItem(String titulo){
        for (T item : acervo) {
           if(item instanceof Jogo){
              Jogo jogo = (Jogo) item;
              if(jogo.getTitulo().equals(titulo)){
                return item;
              }
           }else if(item instanceof Filme) {
              Filme filme = (Filme) item;
              if(filme.getTitulo().equals(titulo)){
                return item;
              }
           }
        }
        return null;
    }

    public List<T> getAcervo() {
        return acervo;
    }

    public String toString(){
        return "Dados " + this.acervo;
    }

}