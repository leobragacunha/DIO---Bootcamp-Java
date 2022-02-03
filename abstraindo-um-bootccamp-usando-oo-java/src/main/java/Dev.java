import java.util.*;

public class Dev {

    private String nomeDev;
    private double progresso;

    private Set<Mentorias> mentoriasInscritas = new LinkedHashSet<>();
    private Set<Mentorias> mentoriasConcluidas = new LinkedHashSet<>();

    private Set<Cursos> cursosInscritos = new LinkedHashSet<>();
    private Set<Cursos> cursosConcluidos = new LinkedHashSet<>();

    public String getNomeDev() {
        return nomeDev;
    }

    public Set<Mentorias> getMentoriasInscritas() {
        return mentoriasInscritas;
    }

    public Set<Mentorias> getMentoriasConcluidas() {
        return mentoriasConcluidas;
    }

    public Set<Cursos> getCursosInscritos() {
        return cursosInscritos;
    }

    public Set<Cursos> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setNomeDev(String nomeDev) {
        this.nomeDev = nomeDev;
    }

    public void setMentoriasInscritas(Set<Mentorias> mentoriasInscritas) {
        this.mentoriasInscritas = mentoriasInscritas;
    }

    public void setCursosInscritos(Set<Cursos> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nomeDev='" + nomeDev + '\'' +
                ", mentoriasInscritas=" + mentoriasInscritas +
                ", mentoriasConcluidas=" + mentoriasConcluidas +
                ", cursosInscritos=" + cursosInscritos +
                ", cursosConcluidos=" + cursosConcluidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nomeDev, dev.nomeDev) && Objects.equals(mentoriasInscritas, dev.mentoriasInscritas) && Objects.equals(mentoriasConcluidas, dev.mentoriasConcluidas) && Objects.equals(cursosInscritos, dev.cursosInscritos) && Objects.equals(cursosConcluidos, dev.cursosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDev, mentoriasInscritas, mentoriasConcluidas, cursosInscritos, cursosConcluidos);
    }

    public void inscreverBootcamp(BootCamp bootcamp){
        bootcamp.getListaDevs().add(this);
        this.cursosInscritos.addAll(bootcamp.getListaCursos());
        this.mentoriasInscritas.addAll(bootcamp.getListaMentorias());
    }

    void progredirCurso(){
        Optional<Cursos> curso = cursosInscritos.stream().findFirst();
        if(curso.isPresent()){
        this.getCursosConcluidos().add(curso.get());
        this.getCursosInscritos().remove(curso.get());
        } else{
            System.err.println("Você ja fez todos os cursos! Parabéns");
        }
    }

    void progredirMentoria(){
        Optional<Mentorias> mentoria = mentoriasInscritas.stream().findFirst();
        if(mentoria.isPresent()){
        this.getMentoriasConcluidas().add(mentoria.get());
        this.getMentoriasInscritas().remove(mentoria.get());
        } else{
            System.err.println("Você ja fez todas as mentorias! Parabéns");
        }
    }

    void calcularTotalXP(){
        progresso = 2*((cursosConcluidos.size())+mentoriasConcluidas.size());
        System.out.printf("Total de XP: %.2f \n", progresso);
    }

    void exibirCursosInscritos(){
        System.out.println("===\t\tCursos Inscritos\t\t=== \n");
        for (Cursos curso: cursosInscritos) {
            System.out.println("Nome: "+ curso.getTitulo());
            System.out.println("Descrição: "+ curso.getDescricao());
            System.out.println("Carga Horária: "+ curso.getCargaHoraria()+ "h\n\n");
        }
    }

    void exibirCursosConcluidos(){
        System.out.println("===\t\tCursos Concluídos\t\t=== \n");
        for (Cursos curso: cursosConcluidos) {
            System.out.println("Nome: "+ curso.getTitulo());
            System.out.println("Descrição: "+ curso.getDescricao());
            System.out.println("Carga Horária: "+ curso.getCargaHoraria()+"h\n\n");
        }
    }

    void exibirMentoriasInscritas(){
        System.out.println("===\t\tMentorias Inscritas\t\t=== \n");
        for (Mentorias ment : mentoriasInscritas){
            System.out.println("Título: " + ment.getTitulo());
            System.out.println("Descrição: " + ment.getDescricao());
            System.out.println("Data: " + ment.getData() + "\n\n");
        }
    }

    void exibirMentoriasConcluidas(){
        System.out.println("===\t\tMentorias Concluídas\t\t=== \n");
        for (Mentorias ment : mentoriasConcluidas){
            System.out.println("Título: " + ment.getTitulo());
            System.out.println("Descrição: " + ment.getDescricao());
            System.out.println("Data: " + ment.getData() + "\n\n");
        }
    }

}
