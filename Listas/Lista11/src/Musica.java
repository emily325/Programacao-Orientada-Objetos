public class Musica {
    String titulo;
    String artista;
    String album;

    public Musica(String titulo, String artista, String album)throws MusicaNaoEncontradaException{
        setTitulo(titulo);
        setArtista(artista);
        SetAlbum(album);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo() throws MusicaNaoEncontradaException{
        return titulo;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getArtista(){
        return artista;
    }
    public void SetAlbum(String album){
        this.album = album;
    }
    public String getAlbum(){
        return album;
    }

    public String toString(){
        return this.titulo;
    }
}
