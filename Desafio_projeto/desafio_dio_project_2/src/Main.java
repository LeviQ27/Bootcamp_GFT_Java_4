
import java.time.LocalDate;

import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

public class Main {


    public static void main(String[] args) 
    {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLevi = new Dev();
        devLevi.setNome("Levi");
        devLevi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Levi: " + devLevi.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Levi: " + devLevi.getConteudosConcluidos());
        devLevi.progredir();
        devLevi.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos Levi: " + devLevi.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Levi: " + devLevi.getConteudosConcluidos());
        System.out.println("XP: " + devLevi.calculaTotalXp());
        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(" - ");
        System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calculaTotalXp());


    }

    
}
