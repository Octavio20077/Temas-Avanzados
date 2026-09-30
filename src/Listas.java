import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List <String> milista = new <String>ArrayList();
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        for (String elemento: milista) {
            System.out.println("Dia de la semana: " + elemento);
        }

    }
}
