package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {
        int idade= 20;
        boolean isAutorizado= idade>=18;
        if (isAutorizado) {
            System.out.println("Autorizado");
        }else{
            System.out.println("fora do if");
        }
        // ! (negação)
        if(!isAutorizado) {
            System.out.println("Não Autorizado");
        }
    }
}
