import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List <String> milista = new <String>ArrayList();
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        //for (String elemento: milista) {
          //  System.out.println("Dia de la semana: " + elemento);

       // milista.forEach(elemento -> {
         //   System.out.println("elemento = " + elemento);
        //});

        milista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Pedro", "Ivonne", "Nohemi");
        System.out.println("\nLista de nombres: " + nombres);
        nombres.forEach(System.out::println);

    }
}
