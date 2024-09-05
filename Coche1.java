package NuevoCoche;

public class Coche1 {

    public String brand;
    public String model;
    public int year;
    public String color;
    public double fuel_level;
    public boolean engine_on;

    public final double MAXIMUM_CAPACITY = 12;

    public Coche1(String brand, String model, int year, String color){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuel_level = 10.0;
        this.engine_on = false;

    }
    public void engine_start(){
        if (!engine_on){
            engine_on = true;
            System.out.println("El motor esta encendido");
        }
        else {
            System.out.println("El motor ya esta encendido.");
        }

    }
    public void engine_turn_off(){
        if (engine_on){
            engine_on = false;
            System.out.println("El motor esta apagado.");
        }
        else {
            System.out.println("El motor ya esta apagado.");
        }
    }
    public void accelerate(){
        if (engine_on){
            if (fuel_level > 0){
                fuel_level -= 0.1;
                System.out.println("El coche ha acelerado. Nivel de combustible: " + fuel_level + " galones");

            } else {
                System.out.println("No hay suficiente combustible para acelerar ");
            }

        } else {
            System.out.println("No puedes acelerar con el motor apagado ");

        }

    }
    public void refuel(double amount){
        if (amount <= 0){
            System.out.println("Cantidad invalida para recargar.");
            return;
        }
        if (fuel_level + amount > MAXIMUM_CAPACITY){
            amount = MAXIMUM_CAPACITY - fuel_level;
            fuel_level = MAXIMUM_CAPACITY;
            System.out.println("El tanque esta lleno. Se recargaron " + amount + " galones.");

        } else {
            fuel_level += amount;
            System.out.println("Se recargaron " + amount + "galonres. Nivel actual: " + fuel_level);
        }
    }
    public double get_fuel_level(){
        return fuel_level;
    }
    public void showInformation(){
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Año: " + year);
        System.out.println("Color: " + color);
        System.out.println("Nivel de combustible: " + fuel_level + " galones");
        System.out.println("Motor encendido: " + (engine_on ? "Si" : "No"));


    }

}