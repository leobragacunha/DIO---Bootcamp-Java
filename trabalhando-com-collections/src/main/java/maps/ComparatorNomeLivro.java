package maps;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getLivro().compareToIgnoreCase(l2.getValue().getLivro());
    }
}
