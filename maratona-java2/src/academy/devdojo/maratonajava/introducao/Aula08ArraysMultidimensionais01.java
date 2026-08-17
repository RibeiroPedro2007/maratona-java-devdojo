package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main(String[] args) {
        //podem ter varias dimensoes, agora ta com duas so
        int[][] dias= new int[3][3];
        dias[0][0]=11;
        dias[0][1]=10;
        dias[0][2]=13;

        dias[1][0]=34;
        dias[1][1]=35;
        dias[1][2]=36;

        dias[2][0]=24;
        dias[2][1]=25;
        dias[2][2]=26;
        
        for (int i=0;i< dias.length;i++){
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------------");

        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
