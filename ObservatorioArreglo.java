package Observatorio;

import java.util.Scanner;

public class ObservatorioArreglo {
    private double[] temperaturas;
    private int contador;

    public ObservatorioArreglo(int capacidad) {
        temperaturas = new double[capacidad];
        contador = 0;
    }

    public void ingresarTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa temperaturas en grados Celsius (escribe 'fin' para terminar):");

        while (contador < temperaturas.length) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                double temperatura = Double.parseDouble(input);
                temperaturas[contador] = temperatura;
                contador++;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingresa un número.");
            }
        }
    }

    public void procesarDatos() {
        if (contador == 0) {
            System.out.println("No se han ingresado temperaturas.");
            return;
        }

        double maxTemp = Double.MIN_VALUE;
        double minTemp = Double.MAX_VALUE;
        double sumaTemp = 0;

        for (int i = 0; i < contador; i++) {
            double temp = temperaturas[i];
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            sumaTemp += temp;
        }

        double promedioTemp = sumaTemp / contador;

        System.out.println("Temperatura máxima: " + maxTemp);
        System.out.println("Temperatura mínima: " + minTemp);
        System.out.println("Temperatura promedio: " + promedioTemp);

        System.out.println("Temperaturas por encima del promedio:");
        for (int i = 0; i < contador; i++) {
            if (temperaturas[i] > promedioTemp) {
                System.out.println(temperaturas[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Se define una capacidad arbitraria de 100 temperaturas
        ObservatorioArreglo observatorio = new ObservatorioArreglo(100);
        observatorio.ingresarTemperaturas();
        observatorio.procesarDatos();
    }
}

