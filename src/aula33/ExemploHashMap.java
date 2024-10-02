package aula33;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS", "Porto Alegre");
        capitais.put("PR", "Curitiba");
        capitais.put("SC", "Florianopolis");
        capitais.put("GO", "Goiânia");
        //Iterar pelas chaves
        System.out.println("Estados...");
        for(String estado: capitais.keySet()){
            System.out.println(estado + " ");
        }
        //Iterar pelos valores
        System.out.println("Cidades...");
        for(String cidade:capitais.values()){
            System.out.println(cidade + " ");
        }
        System.out.println("Lista completa");
        System.out.println(capitais);
        System.out.println(capitais.get("RS"));
        System.out.println(capitais.containsValue("Porto Alegre"));
    }
}
