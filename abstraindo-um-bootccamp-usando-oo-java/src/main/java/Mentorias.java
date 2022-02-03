import java.time.LocalDate;
import java.util.Objects;

public class Mentorias extends Atividades {

   private LocalDate data;

   public Mentorias(String titulo, String descricao) {
      super(titulo, descricao);
   }

   public Mentorias(String titulo, String descricao, LocalDate data) {
      super(titulo, descricao);
      this.data = data;
   }


   public LocalDate getData() {
      return data;
   }

   @Override
   public String toString() {
      return "Mentorias{" +
              "titulo='" + titulo + '\'' +
              ", descricao='" + descricao + '\'' +
              ", data=" + data +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Mentorias mentorias = (Mentorias) o;
      return Objects.equals(data, mentorias.data);
   }

   @Override
   public int hashCode() {
      return Objects.hash(data);
   }
}
