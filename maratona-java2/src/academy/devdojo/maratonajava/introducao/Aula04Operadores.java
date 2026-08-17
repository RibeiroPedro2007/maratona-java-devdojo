package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {

        // + - / *
        int n1=10, n2=20;
        int add= n1+n2;
        int subtract= n1-n2;
        double divide= n1/n2;
        double multiply= n1*n2;
        int rest= n1%n2;
        System.out.println("results: "+add+", "+subtract+", "+divide+", "+multiply+", "+rest);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = n1>n2;// always return true or false depending on the comparison
        boolean isDezMenorQueVinte = n1<n2;
        boolean isDezIgualAVinte = n1==n2;
        boolean isDezDiferenteDeVinte = n1!=n2;
        System.out.println("results: "+isDezMaiorQueVinte+", "+isDezMenorQueVinte+", "+isDezIgualAVinte+", "+isDezDiferenteDeVinte);

        // && (AND) || (OR) !(NEGAÇÃO)
        int idade =29;
        float salario =3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade>=30 && salario>=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade<30 && salario>=3381;
        System.out.println("isDentroDaLeiMenorQueTrinta"+isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);

        double valorDaCorrente =200;
        double valorDaPoupanca =10000;
        float valorPlay5 =5000F;
        boolean isPlay5Compravel = valorDaCorrente>= valorPlay5 || valorDaPoupanca>= valorPlay5;
        System.out.println("isPlay5Compravel"+isPlay5Compravel);

        // += -= *= /= %=
        double bonus =1800;//1800
        bonus+=1000;//2800
        bonus-=100;//2700
        bonus*=2;//5400
        bonus/=2;//2700
        bonus%=2;//0
        System.out.println(bonus);
        // ++ --
        int contador =0;
        contador++;//1
        contador--;//0
        ++contador;//1, incrementa antes
        --contador;//0, incrementa antes
        System.out.println(contador);

    }
}
