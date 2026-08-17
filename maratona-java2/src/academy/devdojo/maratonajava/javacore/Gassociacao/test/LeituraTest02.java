package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTest02 {
    static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("software de previsões");
        String perg= scan.nextLine();
        if (perg.charAt(0)==' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
