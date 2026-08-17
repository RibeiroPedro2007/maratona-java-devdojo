package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        
        String [] nomes= new String[3];
        nomes[0]="21";
        nomes[1]="60";
        nomes[2]="13";
        for(int i=0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
