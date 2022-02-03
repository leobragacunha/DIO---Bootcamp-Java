package sets;

import java.util.Comparator;

public class ComparatorNomeGeneroEp implements Comparator<Serie> {


    @Override
    public int compare(Serie n1, Serie n2) {
        int nome = n1.getNome().compareToIgnoreCase(n2.getNome());
        if (nome != 0) {
            return nome;
        }
        int genero = n1.getGenero().compareToIgnoreCase(n2.getGenero());
        if (genero !=0) {
            return genero;
        }
        int duracaoEP = Integer.compare(n1.getTempoEpisodio(),n2.getTempoEpisodio());
        return duracaoEP;

    }
}
