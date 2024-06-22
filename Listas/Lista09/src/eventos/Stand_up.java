package eventos;

public class Stand_up extends Evento{
    private String comediante;

    public Stand_up(String nome, String local, String data, String comediante){
        super(nome, local, data);
        this.comediante = comediante;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s
            Local: %s
            Data: %s
            Comediante: %s
            """, getNome(), getLocal(), getData(), comediante
        ));
    }

    @Override
    public void comecarEvento(){
        System.out.println("o stand-up comecou!!");
    }

    public void comecarEvento(String piada){
        System.out.println(piada);
    }

    public void setComediante(String comediante){
        this.comediante = comediante;
    }

    public String getComediante(){
        return comediante;
    }
}
