package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main(String[] args) {
        //parece estranho mas funciona pq os vazios não tem break, ai se cair em um em barnco, ele vai executando ate achar um break
        byte dia= 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("opção invalida");
                break;

        }
    }
}
