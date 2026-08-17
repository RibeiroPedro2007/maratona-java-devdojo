package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor prof= new Professor();
        prof.nome= "meuti";
        prof.idade= 144;
        prof.sexo= 'M';
        System.out.println(prof.nome+" "+prof.idade+" "+prof.sexo);
    }
}
