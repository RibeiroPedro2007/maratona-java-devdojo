package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] eps;
    //0- bloco de inicialização é executado quando a JVM carregar classe
    //1- Alocado espaço na memória para o objeto
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for programado
    //3- bloco de inicialização é executado
    //4- construtor é executado

    static{// é executado apenas uma vez (se tiver mais de um é na ordem em que aparece)
        System.out.println("Dentro do bloco de inicialização estático");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i]=i+1;
        }
    }

    {// é executado toda vez que um objeto é criado
        System.out.println("Dentro do bloco de inicialização não estático");
    }


    public Anime(String nome){
        this.nome=nome;
    }
    public Anime(){
        for(int eps: Anime.eps){
            System.out.print(eps+" ");
        }
        System.out.println();
    }

    public static int[] getEps() {
        return Anime.eps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
