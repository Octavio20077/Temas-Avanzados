package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnacks = 0;
    private int idSnack;
    private String Nombre;
    private double precio;

    public Snack(){
        this.idSnack = ++Snack.contadorSnacks;

    }
    public Snack(String Nombre, double precio){
        this(); //debe ser la primer linea la llamada al constructor
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }


    public int getIdSnacks() {
        return idSnack;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "idSnack=" + idSnack +
                ", Nombre='" + Nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(Nombre, snack.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, Nombre, precio);
    }
}
