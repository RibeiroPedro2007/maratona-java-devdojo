package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main(String[] args) {
        int age =17;
        String categoria;

        if(age<15){
            categoria= "infantil";
        }else if(age>=15 && age<18){
            categoria= "juvenil";
        }else{
            categoria= "adulto";
        }
        System.out.println(categoria);
    }
}
