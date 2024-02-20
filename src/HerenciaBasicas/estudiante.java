package HerenciaBasicas;

import java.util.Scanner;

public class estudiante extends Persona
{
        Scanner sc = new Scanner(System.in);
        String carrera;

        public estudiante(String nombre, int edad, String carrera) {
                super(nombre, edad);
                this.carrera = carrera;
        }

        public estudiante(String nombre, int edad) {
                super(nombre, edad);
        }

        public String getCarrera() {
                return carrera;
        }

        public void setCarrera(String carrera) {
                this.carrera = carrera;
        }
        public void estudiar(){
                System.out.println("Estoy estudiando la carrera de " + carrera);

        }


}

