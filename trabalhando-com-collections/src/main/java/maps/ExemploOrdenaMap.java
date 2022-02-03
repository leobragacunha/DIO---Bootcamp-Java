package maps;

import java.util.*;

public class ExemploOrdenaMap {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhhig, Charles" , new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro(" 21 lições para o século 21", 432));
        }};
        for( Map.Entry<String, Livro> livros : meusLivros.entrySet()){
            System.out.println(livros.getKey() + " - " + livros.getValue().getLivro());
        }

        System.out.println("\nOrdem de inserção: ");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhhig, Charles" , new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro(" 21 lições para o século 21", 432));
        }};
        for( Map.Entry<String, Livro> livros : meusLivros2.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getLivro());
        }

        System.out.println("\nOrdem alfabética autores: ");
        Map<String , Livro> meusLivros3 = new TreeMap<>(meusLivros);
        for( Map.Entry<String, Livro> livros : meusLivros3.entrySet()) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getLivro());
        }

        System.out.println("\nOrdem alfabética nomes: ");
        Set<Map.Entry<String,Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros4.addAll(meusLivros.entrySet());
        for( Map.Entry<String, Livro> livros : meusLivros4) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getLivro());
        }


        System.out.println("\nOrdem crescente de páginas: ");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());
        meusLivros5.addAll(meusLivros.entrySet());
        for( Map.Entry<String, Livro> livros : meusLivros5) {
            System.out.println(livros.getKey() + " - " + livros.getValue().getLivro() + " - " + livros.getValue().getPaginas());
        }






    }


}
