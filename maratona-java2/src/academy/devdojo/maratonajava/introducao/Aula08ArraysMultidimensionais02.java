package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    static void main(String[] args) {
        int[][] dias= new int[3][];
        dias[0]= new int[3];//dia 0 vai ter 3 posições 0,0 ; 0,1 ; 0,2 ; 0,3
        dias[1]= new int[4];//dia 1 vai ter 4 posições 1,0 ; 1,1 ; 1,2 ; 1,3 ; 1,4
        dias[2]= new int[5];//dia 2 vai ter 5 posições 2,0 ; 2,1 ; 2,2 ; 2,3 ; 2,4 ; 2,5

        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
        int[][] exemplos= {{0, 0}, {1,2,3}, {3,4,5,6,7}};
        int[] array = {1,2,3};
        int[][] exemplo= new int[4][];

        exemplo[0]= new int[2];
        exemplo[1]= array;
        exemplo[2]= new int[]{1,2,3,4,5,6};


    }
}
