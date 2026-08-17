package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    static void main(String[] args) {
        int [] idades= new int[3];//arrays são references, não tipos primitidos, tbm são considerados objetos
        idades[0]=21;
        idades[1]=60;
        idades[2]=13;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
