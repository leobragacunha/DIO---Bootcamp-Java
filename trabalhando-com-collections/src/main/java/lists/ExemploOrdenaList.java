package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenaList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
          add(new Gato("Jon", 18, "preto"));
          add(new Gato("Simba", 6, "tigrado"));
          add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("Imprima na ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("\nImprima em uma ordem aleatória: ");
        Collections.shuffle(meusGatos); //Conferir Override toString na classe Gato
        System.out.println(meusGatos);

        System.out.println("\nImprima em ordem alfabética de nome:");
        Collections.sort(meusGatos);    //Conferir implementação de interface Comparable na classe gato
        System.out.println(meusGatos);

        System.out.println("\nImprima em ordem crescente de idade:");
        //Collections.sort(meusGatos,new ComparatorIdade()); forma alternativa
        meusGatos.sort(new ComparatorIdade());  //Olhar estrutura da classe comparatorIdade
        System.out.println(meusGatos);

        System.out.println("\nImprima em ordem alfabética de cor:");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\nOrdeme por nome/cor;idade: ");
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }


}

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    Gato(String nome, Integer idade, String cor){
        this.nome=nome;
        this.idade=idade;
        this.cor=cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override //Se não sobrescrever o método toString na classe, ele imprimirá os endereços de memória
    public String toString() {
        return "nome='" + nome + '\'' + ", idade=" + idade + ", cor='" + cor + '\'';
    }

    @Override   //Se não tiver a implementação da interface Comparable e a sobrescrição desse método, o comando não funciona
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    }

class ComparatorIdade implements Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements  Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {
        int nome;
        nome =  g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0){
            return nome;
        }
        int cor;
        cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0 ){
            return cor;
        }
        return Integer.compare(g1.getIdade(),g2.getIdade());



    }
}