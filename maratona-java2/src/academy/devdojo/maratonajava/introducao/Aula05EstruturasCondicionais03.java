package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        //doar se salario for > 5000
        double salario= 6000;
        String Doar= "sim";
        String NaoDoar= "Não";

        //operador ternario = (condição) ? verdadeiro : falso;
        String resultado = salario>5000 ? Doar : NaoDoar;
        System.out.println(resultado);

        String resultado2 = salario>5000 ? "sim" : "Não";
        System.out.println(resultado2);

        boolean posso = salario>5000 ? true : false;
        System.out.println(posso);
    }
}
