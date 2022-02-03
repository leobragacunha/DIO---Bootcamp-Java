import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Dev leonardo = new Dev();
        BootCamp bootcamp = new BootCamp();

        Cursos curso1 = new Cursos("Introdução ao Java", "Aprenda os primeiros comandos sobre Java!", 3);
        Cursos curso2 = new Cursos("Introdução ao SpringBoot", "Saiba mais sobre o framework SpringBoot", 4);
        Cursos curso3 = new Cursos("Introdução aos Bancos de dados", "Noções básicas e principais operações com MySQL", 6);
        bootcamp.getListaCursos().add(curso1);
        bootcamp.getListaCursos().add(curso2);
        bootcamp.getListaCursos().add(curso3);

        Mentorias ment1 = new Mentorias("Mentoria com Camila", "Validando implementações Java", LocalDate.of(2022,2,15));
        Mentorias ment2 = new Mentorias("Mentoria com Pedro", "Exemplos práticos com SpringBoot", LocalDate.of(2022,3,29));
        Mentorias ment3 = new Mentorias("Mentoria com Camila", "Montando nosso primeiro BD SQL", LocalDate.of(2022,4,30));
        bootcamp.getListaMentorias().add(ment1);
        bootcamp.getListaMentorias().add(ment2);
        bootcamp.getListaMentorias().add(ment3);

        leonardo.setNomeDev("Leonardo Braga Cunha");
        leonardo.inscreverBootcamp(bootcamp);
        leonardo.exibirCursosInscritos();
        leonardo.exibirCursosConcluidos();
        leonardo.exibirMentoriasInscritas();
        leonardo.exibirMentoriasConcluidas();
        System.out.println("\n\n=====================================================\n\n");

        leonardo.progredirCurso();
        leonardo.progredirMentoria();
        leonardo.progredirCurso();
        leonardo.exibirCursosInscritos();
        leonardo.exibirCursosConcluidos();
        leonardo.exibirMentoriasInscritas();
        leonardo.exibirMentoriasConcluidas();
        leonardo.calcularTotalXP();




    }


}
