/*Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.*/


package clase_5;

import java.util.Scanner;

public class miles_to_km {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la distancia en millas: ");
        double millas= scanner.nextDouble();

        double kms= millas * 1.60934;
        System.out.println("La distancia en Kilometros es: "+ kms);

    }
}
