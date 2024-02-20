package HerenciaBasicas;

public class Persona {
    String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }


    public void saludar(){
        System.out.println("Hola, soy " + nombre +" y tengo " + edad + " años.");
    }
}
