package locadora;

public class Jogo implements AudioVisual {
    String titulo;
    String plataforma;

    public Jogo(String titulo, String plataforma){
        this.titulo =  titulo;
        this.plataforma = plataforma;
    }

    public void exibirInfo(){
        System.out.println(String.format(
            """
             Jogo: %s
             Plataforma: %s   
            """,
            getTitulo(), getPlataforma()
        ));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }     
}
