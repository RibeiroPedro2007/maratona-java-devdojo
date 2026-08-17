package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
    // int, double, float, char, byte, short, long, boolean
        int age = (int)10000000000L;//casting
        long bigNumber =(long)122.23;
        double wage =1860.23;
        float wagefloat =1860.32F;
        byte ageByte =127;
        short ageShort =32000;
        boolean verdadeiro = true;
        boolean falso =false;
        char caractere = '\u0041';
        // string não é tipo primitivo
        String name ="Pedro";

        System.out.println("idade: "+age+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(bigNumber);
        System.out.println(name);
    }
}
