package maps;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione modelo e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
            System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15.4 km/l:");
        carrosPopulares.put("Gol", 15.4);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo Tuckson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("Tuckson"));

        System.out.println("\nExiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("Uno"));

        //System.out.println("\nExiba o terceiro modelo adicionado: ");       IMPOSSIVEL

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("\nExiba o modelo mais econômico e o seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente ="";
        for (Map.Entry<String,Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo:" + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("\nExiba o modelo menos economico e o seu consumo: ");
        Double consumoMenosEiciente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry1 : entries){
            if(entry1.getValue().equals(consumoMenosEiciente)){
                modeloMenosEficiente = entry1.getKey();
                System.out.println("Modelo: " + modeloMenosEficiente + " - " + consumoMenosEiciente);
            }
        }

        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma=0;
        while (iterator.hasNext()){
            double next = iterator.next();
            soma +=next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média dos consumos: ");
        System.out.println(soma/carrosPopulares.size());

        System.out.println("\nRemova os modelos com consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        double remove = 15.6;
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (remove == next){
               iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("\nExiba o dicionário na ordem natural pelo modelo: ");
        Map<String , Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o dicionário está vazio: ");
        System.out.println(carrosPopulares.isEmpty());


    }




}
