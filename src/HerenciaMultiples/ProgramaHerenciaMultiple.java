package HerenciaMultiples;

public class ProgramaHerenciaMultiple {
    public static void main(String[] args) {
        Perro perrito = new Perro();
        System.out.println("");
        System.out.println("Perro:");
        perrito.comer();
        perrito.ladrar();
        perrito.jugar();

        Gato gatito = new Gato();
        System.out.println("");
        System.out.println("Gato:");
        gatito.comer();
        gatito.maullar();
        gatito.jugar();

        Tortuga tortuguita = new Tortuga();
        System.out.println("");
        System.out.println("Tortuga:");
        tortuguita.comer();
        tortuguita.reptar();

        Loro lorito = new Loro();
        System.out.println("");
        System.out.println("Loro:");
        lorito.comer();
        lorito.hablar();
        lorito.jugar();

        Pantera panterita = new Pantera();
        System.out.println("");
        System.out.println("Pantera:");
        panterita.comer();
        panterita.rugir();
        panterita.cazar();





    }

}
