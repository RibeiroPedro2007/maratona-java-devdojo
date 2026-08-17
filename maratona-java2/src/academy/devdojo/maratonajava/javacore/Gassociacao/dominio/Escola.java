package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] profs;


    public Escola(String nome){//uma escola pode ter 0 profs
        this.nome= nome;
    }

    public Escola(String nome, Professor[] profs) {//pode já por o prof se ele tiver disponivel
        this.nome = nome;
        this.profs = profs;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(profs==null)return;
        for (Professor prof : profs) {
            System.out.println(prof.getNome());
        }
    }

    public Professor[] getProfs() {
        return profs;
    }

    public void setProfs(Professor[] profs) {
        this.profs = profs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
