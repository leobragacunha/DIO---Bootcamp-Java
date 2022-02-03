import java.time.LocalDate;

public class AtividadesCursos {

    private String titulo;
    private String descrição;
    private LocalDate data;
    private int experiencia;

    public enum status (Integer progresso) {
        CONCLUIDO (100),
        EM_ANDAMENTO (50),
        NAO_INICIADO (0);

        private Integer progresso;

        status(Integer progresso) {
            this.progresso=progresso;
        }

        public Integer getProgresso() {
            return progresso;
        }

        public void setProgresso(Integer progresso) {
            this.progresso = progresso;
        }
    }

    public AtividadesCursos(String titulo, String descrição, LocalDate data) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    int CalcularXP (int experiencia){
        this.experiencia=experiencia;
        if (status.valueOf("CONCLUIDO"))
            return status.CONCLUIDO.getProgresso()*experiencia;
        else if (status.valueOf("EM ANDAMENTO"))
            return status.EM_ANDAMENTO.getProgresso()*experiencia;
        else if (status.valueOf("NAO_INICIADO"))
            return status.EM_ANDAMENTO.getProgresso()*experiencia;

    }

}
