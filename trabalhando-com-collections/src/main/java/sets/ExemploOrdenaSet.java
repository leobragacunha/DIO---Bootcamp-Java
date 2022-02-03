package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenaSet {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("GoT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("T70S", "comedia", 25));
        }};
            for(Serie serie: minhasSeries) {
                System.out.println("Nome: "+ serie.getNome()+"\t\t\t Gênero: "+serie.getGenero()+"\t\t\tDuração Ep.: "+serie.getTempoEpisodio());
            }



        System.out.println("\nOrdem natural (tempo episódio): ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);

        for(Serie serie: minhasSeries2) {
            System.out.println("Nome: "+ serie.getNome()+"\t\t\t Gênero: "+serie.getGenero()+"\t\t\tDuração Ep.: "+serie.getTempoEpisodio());
        }


        System.out.println("\nOrdem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroEp());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3) {
            System.out.println("Nome: " + serie.getNome() + "\t\t\t Gênero: " + serie.getGenero() + "\t\t\tDuração Ep.: " + serie.getTempoEpisodio());
        }

    }

}
