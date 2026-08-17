package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local loc;

    public Seminario(String titulo, Local loc) {
        this.titulo = titulo;
        this.loc = loc;
    }

    public Seminario(String titulo, Local loc, Aluno[] alunos) {
        this.titulo = titulo;
        this.loc = loc;
        this.alunos = alunos;
    }

    public Local getLoc() {
        return loc;
    }

    public void setLoc(Local loc) {
        this.loc = loc;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
