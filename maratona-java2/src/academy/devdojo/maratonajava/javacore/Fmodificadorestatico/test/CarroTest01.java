package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro("BM", 280);
        Carro carro2 = new Carro("Meca", 275);
        Carro carro3= new Carro("Audi", 290);
        //carro2.setVeloLimite(180);// o modficador de acesso do atributo velocidade limite por ser static "estatico", quando vc modifica ele, não modifica só o atributo daquele objeto instanciado (carro2), mas sim do objeto como um todo (Carro)
        Carro.veloLimite= 180;// ele é public, por isso que dá pra acessar ele aqui
        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
