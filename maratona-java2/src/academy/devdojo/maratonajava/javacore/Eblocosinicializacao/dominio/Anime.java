package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] eps;

    {
        System.out.println("Dentro do bloco de inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i]=i+1;
        }
    }


    public Anime(String nome){
        this.nome=nome;
    }
    public Anime(){
        for(int eps: this.eps){
            System.out.print(eps+" ");
        }
        System.out.println();
    }

    public int[] getEps() {
        return eps;
    }

    public void setEps(int[] eps) {
        this.eps = eps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
