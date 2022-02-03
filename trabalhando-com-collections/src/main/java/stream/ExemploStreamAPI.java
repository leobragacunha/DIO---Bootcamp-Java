package stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        //ANALISAR DE BAIXO PARA CIMA, A OTIMIZAÇÃO DO COMANDO:
        numerosAleatorios.forEach(System.out::println);
//      numerosAleatorios.stream().forEach(System.out::println);

        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

//--------------------------------------------------------------------------------------------------------

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        //ANALISAR DE BAIXO PARA CIMA, A OTIMIZAÇÃO DO COMANDO:
        numerosAleatorios.stream()
                .limit(5)                                   //Determina o tamanho do stream
                .collect(Collectors.toSet())                //Aloca os valores em um set
                .forEach(System.out::println);              //Reference method para impressão
//        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());
//        System.out.println(numerosAleatorios5Primeiros);


//---------------------------------------------------------------------------------------------------------

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatorios1.forEach(System.out::println);

//        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());


        /*numerosAleatorios.stream()
                .map((s -> Integer.parseInt(s)));*/

        /*numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                }); */

//---------------------------------------------------------------------------------------------------------

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
       //ANALISAR DE BAIXO PARA CIMA, A OTIMIZAÇÃO DO COMANDO:
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);
//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

            /*numerosAleatorios.stream()
                    .map(s -> Integer.parseInt(s))
                    .filter(i -> i%2==0 && i>2)
                    .forEach(System.out::println);*/
        
            /*numerosAleatorios.stream()
                    .map(new Function<String, Integer>() {
                        @Override
                        public Integer apply(String s) {
                            return Integer.parseInt(s);
                        }
                    })
                    .filter(new Predicate<Integer>() {
                        @Override
                        public boolean test(Integer i) {
                            if(i %2 ==0 && i>2) return true;
                            return false;
                        }
                    })
                    .forEach(System.out::println);*/

//---------------------------------------------------------------------------------------------------

        System.out.println("Mostre a média dos números: ");
        //ANALISAR DE BAIXO PARA CIMA, A OTIMIZAÇÃO DO COMANDO:
        numerosAleatorios.stream()
               .mapToInt(Integer::parseInt)
               .average()
               .ifPresent(System.out::println);

        /*numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(value -> System.out.println(value));*/


        /*numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double value) {
                        System.out.println(value);
                    }
                });*/

//----------------------------------------------------------------------------------------------------

        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatorios3 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatorios3.removeIf(i -> i % 2 != 0);

        System.out.println(numerosAleatorios3);


//        Para você
//        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//        numerosAleatoriosInteger.stream()
//                .skip(3)
//                .forEach(System.out::println);

//        long countNumerosUnicos = numerosAleatoriosInteger.stream()
//                .distinct()
//                .count();
//        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

//        System.out.print("Mostre o menor valor da lista: ");
//        numerosAleatoriosInteger.stream()
//                .mapToInt(Integer::intValue)
//                .min()
//                .ifPresent(System.out::println);

//        System.out.print("Mostre o maior valor da lista: ");
//        numerosAleatoriosInteger.stream()
//                .mapToInt(Integer::intValue)
//                .max()
//                .ifPresent(System.out::println);;
//
//        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
//                .filter(i -> (i % 2 == 0))
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);
//
//        System.out.println("Mostre a lista na ordem númerica: ");
//        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
//                .sorted(Comparator.naturalOrder())
//                .collect(Collectors.toList());
//        System.out.println(numerosOrdemNatural);
//
//        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
//        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
//                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
//        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
