package HerenciaMultiples;

public class Perro extends Mascota implements Animal{
    public void comer(){
        System.out.println("Estoy comiendo croquetas");
    }
    public void ladrar(){
        System.out.println("guau guau");
    }

}
