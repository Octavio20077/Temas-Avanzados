import Excepciones.ForEach;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Octavio");
        conjunto.add("Octavio");
        conjunto.add("Andres");

        System.out.println("Elementos de la lista: ");
        conjunto.forEach(System.out::println);

        //remover elemento
        conjunto.remove("Andres");
        System.out.println("Nuevos elementos: ");
        conjunto.forEach(System.out::println);
    }
}
