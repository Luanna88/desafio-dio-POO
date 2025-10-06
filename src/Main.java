import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;
import java.time.LocalDate;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria curso Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp developer Java");
        bootcampJava.setDescricao("Bootcamp bootcamp developer Java");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devLuanna = new Dev();
        devLuanna.setNome("Luanna");
        devLuanna.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos" + devLuanna.getConteudosInscritos());
        devLuanna.progredir();
        devLuanna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devLuanna.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devLuanna.getConteudosConcluidos());
        System.out.println("XP" + devLuanna.calcularTotalXP());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXP());

    }
}