package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;
    private String gen;

    public Anime(){

    }

    public void init(String nome, String tipo, int eps){
        this.nome=nome;
        this.tipo=tipo;
        this.eps=eps;
    }
    //sobregarga de métodos
    public void init(String nome, String tipo, int eps, String gen){
        this.init(nome, tipo, eps);
        this.gen=gen;
    }

    public void imprime(){
        System.out.printf(this.nome+ "\n" + this.tipo + "\n" + this.eps + "\n" + this.gen);
    }

    public void setGen(String gen){
        this.gen =gen;
    }
    public String getGen(){
        return this.gen;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo (String tipo){
        this.tipo =tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setEps(int eps){
        this.eps=eps;
    }
    public int getEps(){
        return this.eps;
    }
}
