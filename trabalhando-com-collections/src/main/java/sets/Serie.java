package sets;

import java.util.Objects;

public class Serie implements  Comparable<Serie>{

    private String nome;
    private String genero;
    private int tempoEpisodio;

    public Serie(String nome, String genero, int tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public int getTempoEpisodio() {
            return tempoEpisodio;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public void setTempoEpisodio(int TempoEpisodio) {
            this.tempoEpisodio = tempoEpisodio;
        }

        @Override   //Importante senão o sout mostra a posição da memória em que está o objeto.
        public String toString() {
            return "nome='" + nome + '\'' +", genero='" + genero + '\'' +", tempoEpisodio=" + tempoEpisodio ;
        }


        //IMPORTANTE: toda collection que começa com Hash precisa da sobrescrita dos métodos equal e hashcode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return tempoEpisodio == serie.tempoEpisodio && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }


    @Override
    public int compareTo(Serie serie) {
        int tempoEP = Integer.compare(this.tempoEpisodio, serie.tempoEpisodio);
        if(tempoEP == 0 ){
            int genero = this.getGenero().compareTo(serie.getGenero());
            return genero;
        }
        return tempoEP;
    }
}

