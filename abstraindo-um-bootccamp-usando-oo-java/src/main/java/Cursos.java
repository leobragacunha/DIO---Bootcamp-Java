import java.time.LocalDate;
import java.util.Objects;

public class Cursos extends Atividades {

    protected int cargaHoraria;

    public Cursos(String titulo, String descricao) {
        super(titulo, descricao);
    }


    public Cursos (String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return cargaHoraria == cursos.cargaHoraria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargaHoraria);
    }
}
