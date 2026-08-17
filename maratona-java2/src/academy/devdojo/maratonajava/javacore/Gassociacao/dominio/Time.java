package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogs;

    public Time(String nome, Jogador[] jogs) {
        this.nome = nome;
        this.jogs = jogs;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (jogs==null)return;

        for(Jogador jogador:jogs){
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogs() {
        return jogs;
    }

    public void setJogs(Jogador[] jogs) {
        this.jogs = jogs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
