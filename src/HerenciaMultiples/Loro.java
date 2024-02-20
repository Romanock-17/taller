package HerenciaMultiples;

public class Loro extends Mascota implements Animal{
    public void comer(){
        System.out.println("Estoy comiendo semillas");
    }
    public void hablar(){
        System.out.println("Hola, soy un loro");
    }

}
