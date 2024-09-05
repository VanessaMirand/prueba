package NuevoCoche;

import NuevoCoche.Coche1;

public class miCoche {
    public static void main(String[] args) {
        Coche1 miCoche = new Coche1("Toyota", "Corolla", 2020, "Morado");

        miCoche.showInformation();
        miCoche.engine_start();
        miCoche.accelerate();
        miCoche.refuel(1);
        miCoche.accelerate();
        miCoche.engine_turn_off();
        miCoche.showInformation();

    }
}