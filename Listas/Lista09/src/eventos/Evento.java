package eventos;
public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data){
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public void exibirInformacoes(){
        System.out.println(nome);
        System.out.println(local);
        System.out.println(data);
    }

    public abstract void comecarEvento();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String getLocal(){
        return local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
