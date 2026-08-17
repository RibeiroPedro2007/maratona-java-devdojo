package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    static void main(String[] args) {

        double valorTotal=30000;

        for(int parcela=(int) valorTotal;parcela>=1;parcela--){

            double valorParcela= valorTotal/parcela;
            if(valorParcela<1000){
                continue;//volta pro For
            }
            System.out.println("Parcela "+ parcela +" R$ "+ valorParcela);

        }

    }
}
