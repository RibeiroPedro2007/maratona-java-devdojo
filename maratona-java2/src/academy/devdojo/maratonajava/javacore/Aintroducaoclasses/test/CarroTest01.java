package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.Nome = "Fusca";
        carro1.Modelo = "Sport";
        carro1.Ano = 1969;

        carro2.Nome = "Mustang";
        carro2.Modelo = "GT-500";
        carro2.Ano = 1968;

        System.out.println("Carro 1:");
        System.out.println(carro1.Nome);
        System.out.println(carro1.Modelo);
        System.out.println(carro1.Ano);

        System.out.println("\nCarro 2:");
        System.out.println(carro2.Nome);
        System.out.println(carro2.Modelo);
        System.out.println(carro2.Ano);

    }
}
