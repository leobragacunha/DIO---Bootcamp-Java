package maps;

import java.util.Objects;

public class Livro {

    private String livro;
    private int paginas;

    public Livro(String livro, int paginas) {
        this.livro = livro;
        this.paginas = paginas;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //IMPORTANTE: toda collection que vem de MAP deve ter a sobrescrita do equals e do HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro1 = (Livro) o;
        return paginas == livro1.paginas && Objects.equals(livro, livro1.livro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livro, paginas);
    }


    //Se não sobrescrever o toString, ele pegará os endereços na memória na hora de imprimir.
    @Override
    public String toString() {
        return "livro='" + livro + '\'' +", paginas=" + paginas;
    }
}
