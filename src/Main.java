import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("Descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer ");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscrito: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos inscrito: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXP());

        System.out.println("*************************************************");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscrito: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos inscrito: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXP());

        System.out.println("*************************************************");

        Dev devAntonio = new Dev();
        devAntonio.setNome("Antonio");
        devAntonio.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos inscrito: " + devAntonio.getConteudosInscritos());
        devAntonio.progredir();
        devAntonio.progredir();
        devAntonio.progredir();
        System.out.println("----------");
        System.out.println("Conteúdos inscrito: " + devAntonio.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devAntonio.getConteudosConcluidos());
        System.out.println("XP:" + devAntonio.calcularTotalXP());
    }
}
