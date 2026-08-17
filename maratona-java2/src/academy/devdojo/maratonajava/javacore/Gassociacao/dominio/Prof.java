package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Prof {
    private String nome;
    private String especs;
    private Seminario[] semis;

    public Prof(String nome, String especs, Seminario[] semis) {
        this.nome = nome;
        this.especs = especs;
        this.semis = semis;
    }

    public void imprime(){
        System.out.println("--------------------");
        System.out.println("Professor: "+this.nome);
        if (this.semis==null)return;
        System.out.println("Seminarios: ");
        for (Seminario semi : this.semis) {
            System.out.println(semi.getTitulo());
            System.out.println(semi.getLoc().getEndereco());
            if (semi.getAlunos()==null)continue;
            System.out.println("Alunos:");
            for (Aluno aluno : semi.getAlunos()) {
                System.out.println(aluno.getNome());
                System.out.println(aluno.getIdade());
            }

        }

    }

    public String getEspecs() {
        return especs;
    }

    public void setEspecs(String especs) {
        this.especs = especs;
    }

    public Seminario[] getSemis() {
        return semis;
    }

    public void setSemis(Seminario[] semis) {
        this.semis = semis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
