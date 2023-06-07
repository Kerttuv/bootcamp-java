package clase_5;
/*Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula:
        propina = totalCuenta * (porcentajePropina / 100).
 */

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el total de su cuenta: ");
        double totalCuenta = scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea adicionar a su cuenta: ");
        double porcentajePropina = scanner.nextDouble();

        double propina= totalCuenta * (porcentajePropina/100);

        System.out.println("El total a pagar de su propina es: "+ propina);
    }
}
