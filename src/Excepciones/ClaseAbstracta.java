package Excepciones;

public class ClaseAbstracta {
    public static void main(String[] args) {
       //Excepciones.Excepciones.FiguraGeometrica figuraGeometrica = new Excepciones.Excepciones.FiguraGeometrica(); //error, no se puede instanciar
FiguraGeometrica figuraGeometrica = new rectangulo();
figuraGeometrica.dibujar();
figuraGeometrica = new Circulo();
    }
}


//clase abstacta
abstract class FiguraGeometrica{ //no se puede instanciar
    public abstract void dibujar();

}
class rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se debe dibujar un Rectangulo");
    }
}
class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se debe dibujar un circulo");
    }
}
