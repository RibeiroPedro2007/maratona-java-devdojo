package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double veloMax;
    public static double veloLimite =250;

    public Carro(String nome, double veloMax) {
        this.nome = nome;
        this.veloMax = veloMax;
    }

    public static void setVeloLimite(double veloLimite) {
        Carro.veloLimite = veloLimite;
    }

    public static double getVeloLimite(){
        return Carro.veloLimite;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println(this.nome);
        System.out.println(this.veloMax);
        System.out.println(Carro.veloLimite);// usa o objeto ao inves do this pq esse atributo é static
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(double veloMax) {
        this.veloMax = veloMax;
    }

}
