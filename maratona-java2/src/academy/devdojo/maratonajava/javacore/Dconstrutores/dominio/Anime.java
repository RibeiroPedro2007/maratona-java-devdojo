package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;
    private String gen;
    private String estudio;

    //não pode ter um objeto sem tem esse argumento, mesmo que dps ele seja sobrescrito
    public Anime(String nome, String tipo, int eps, String gen){
        this.nome=nome;
        this.tipo=tipo;
        this.eps=eps;
        this.gen=gen;
    }
    //sobrecarga de contrutores
    public Anime(String nome, String tipo, int eps, String gen, String estudio){
        this(nome, tipo, eps, gen);//faz referencia ao própio construtor, usado na sobrecarga
        this.estudio=estudio;
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
