package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main(String[] args) {
        double wageYear= 7000;
        double firstRange= 9.7/100;
        double secondRange= 37.35/100;
        double thirdRange= 49.50/100;
        double valueTax=0.0;

        if(wageYear <= 34712){
            valueTax *= firstRange;
        }else if(wageYear >= 34713 && wageYear <= 68507){
            valueTax *= secondRange;
        }else{
            valueTax *= thirdRange;
        }
        System.out.println(valueTax);
    }
}
