package lists;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        //List notas = new ArrayList();                 Antes do Java 5
        //List<Double> notas = new ArrayList<>();       Dentro do diamond é como se tivesse outro Double
        //ArrayList<Double> notas = new ArrayList<>();  Não recomendado. O ideal é usarmos a interface como tipo de variável, e não a implementação.
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 7d, 5d, 0d, 3.6 ));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 7d, 5d, 0d, 3.6); //Não permite adição e retirada de elementos
            notas.add(10);
            System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 7d, 5d, 0d, 3.6); //Lista imutável, não permite adição/remoção
            notas.add(10);
            notas.remove(5d);*/

        System.out.println("Crie uma lista e adicione as sete notas:");
        List<Double> notas = new ArrayList<>(); //2a da lista
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(7d);
        notas.add(5d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5:");
        System.out.println(notas.indexOf(5d));

        System.out.println("\nAdicione a nota 8 na posição 4 da lista:");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5 pela nota 6:");
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas);

        System.out.println("\nConfira se o numero 5 está na lista:");
        System.out.println(notas.contains(5d));

        System.out.println("\nExibas as notas na ordem em que foram inseridas:");
        for(double numero : notas){
            System.out.println(numero);
        }

        System.out.println("\nExiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores: ");
        Iterator<Double>iterator = notas.iterator() ;
        Double soma = 0d;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas: ");
        System.out.println(soma/ notas.size());

        System.out.println("\nRemova a nota 0:");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("\nRemova a nota da posição 0:");
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("\nRemova as notas menores que 7:");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next<7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista:");
        notas.clear();
        System.out.println(notas.isEmpty());
        System.out.println(notas);


    }

}
