package sets;

import java.util.*;

public class ExemplosSet {

    public static void main(String[] args) {

/*      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6))
  */

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ));
        System.out.println(notas);

        // System.out.println("Exiba a posição da nota 5");  IMPOSSIVEL

        //System.out.println("Adicione na lista a nota 8 na posição 4: ");    IMPOSSIVEL

        //System.out.println("Substituia a nota 5 por 6: ");  IMPOSSIVEL

        System.out.println("\nConfira se a nota 5 está no conjunto");
        System.out.println(notas.contains(5d));

        //System.out.println("\nExiba a 3a nota adicionada:"); IMPOSSIVEL

        System.out.println("\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma +=next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média dos valores: ");
        System.out.println(soma/notas.size());


        System.out.println("\nRemova o valor 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("Remova a nota na posição 0"); IMPOSSIVEL

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next<7){
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());

        System.out.println("\nExiba todas as notas na ordem em que foram informadas: "); //IMPOSSIVEL COM O HASHSET.
        Set<Double> notas2 = new LinkedHashSet<>(); //só foi possível pq criamos um LinkedHashSet
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println(("\nExiba todas as notas na ordem crescente: ")); //IMPOSSIVEL COM O HASHSET
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\nApague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se o conjunto está vazio: ");
        System.out.println(notas.isEmpty());



    }

}
