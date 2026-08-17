package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {//void não retorna nada
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }
    public double divideDoisNumeros(double num, double num2){
        if (num2==0){
            return 0;
        }
        return num/num2;
    }
    public void imprimeDivideDoisNumeros(double num, double num2){
        if (num2==0){
            System.out.println("não se divide por 0");
            return; //break para metodos void
        }
        System.out.println(num/num2);
    }
    public void alteraDoisNumeros(int numero1, int numero2){
        numero1=99;
        numero2=33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+numero1);
        System.out.println("Num2 "+numero2);
    }

    public void somaArray(int[] numeros){
        int soma=0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma=0;
        for(int num : numeros){
            soma+=num;
        }
        System.out.println(soma);
    }
}
