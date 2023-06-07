package clase_5;
/*Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.*/

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.println("Ingrese el precio original de su producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double porcentaje_descuento = scanner.nextDouble();


        double precioFinal= precioOriginal-(precioOriginal * porcentaje_descuento/100);

        System.out.println("Su precio final es: " + precioFinal);

    }
}
