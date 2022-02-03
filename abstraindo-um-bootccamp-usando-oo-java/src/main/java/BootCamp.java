import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class BootCamp {

    private String nome;
    private String descricao;

    private final LocalDate dataInscricao = LocalDate.now();
    private final LocalDate dataConclusao = dataInscricao.plusDays(30);

    private Set<Cursos> listaCursos = new LinkedHashSet<>();
    private Set<Mentorias> listaMentorias = new LinkedHashSet<>();
    private Set<Dev> listaDevs = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public Set<Cursos> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(Set<Cursos> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public Set<Mentorias> getListaMentorias() {
        return listaMentorias;
    }

    public void setListaMentorias(Set<Mentorias> listaMentorias) {
        this.listaMentorias = listaMentorias;
    }

    public Set<Dev> getListaDevs() {
        return listaDevs;
    }

    public void setListaDevs(Set<Dev> listaDevs) {
        this.listaDevs = listaDevs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInscricao, bootCamp.dataInscricao) && Objects.equals(dataConclusao, bootCamp.dataConclusao) && Objects.equals(listaCursos, bootCamp.listaCursos) && Objects.equals(listaMentorias, bootCamp.listaMentorias) && Objects.equals(listaDevs, bootCamp.listaDevs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInscricao, dataConclusao, listaCursos, listaMentorias, listaDevs);
    }

    @Override
    public String toString() {
        return "BootCamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInscricao=" + dataInscricao +
                ", dataConclusao=" + dataConclusao +
                ", listaCursos=" + listaCursos +
                ", listaMentorias=" + listaMentorias +
                ", listaDevs=" + listaDevs +
                '}';


    }
}
