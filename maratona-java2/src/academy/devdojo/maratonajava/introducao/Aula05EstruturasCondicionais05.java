package academy.devdojo.maratonajava.introducao;

import java.lang.classfile.instruction.SwitchCase;

public class Aula05EstruturasCondicionais05 {
    static void main(String[] args) {
        byte dia=1;
        //char, int, byte, char, enum, String
        switch (dia){
            default:
                System.out.println("opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

        }
        char sex='M';
        switch (sex){
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }
}
