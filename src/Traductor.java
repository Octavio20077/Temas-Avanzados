public interface Traductor {
    //ppor default si no definimos son public y abstract
    void traducir();


    //metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor...");
    }
}
class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");

    }
}
class Frances implements Traductor{
public void traducir(){
    System.out.println("Traduzco a Frances");
}
@Override
    public void iniciarTraductor(){
    System.out.println("Iniciando Traductor en frances");
}
}


class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        //iniciar traductor en frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
