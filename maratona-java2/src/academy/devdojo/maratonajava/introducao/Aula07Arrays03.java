package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {
        //jeitos diferentes de declarar um array
        int[] numeros= new int[3];
        int[] numeros2={1,2,3};
        int[] numeros3= new int[]{1,2,3};

        //foreach
        for(int num: numeros3){
            System.out.println(num);
        }
    }
}
