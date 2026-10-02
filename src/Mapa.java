import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> Persona = new HashMap<>();
        Persona.put("Nombre", "Octavio");
        Persona.put("Apellido", "Caballero");
        Persona.put("Edad", "19Años");
        Persona.entrySet().forEach(System.out::println);
    }
}
