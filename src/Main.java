import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "Um curso de Java", 8);
        Curso curso2 = new Curso("curso js", "Um curso de Js", 4);
        Mentoria mentoria1 = new Mentoria("mentoria java", "Um metoria de Java", 2);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
