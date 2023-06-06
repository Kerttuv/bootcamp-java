package clase_5;
import java.util.Scanner;
public class edad_perro {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro: ");

        double edad_perro= scanner.nextDouble();
        double edad_humano= edad_perro * 7;

        System.out.println("La edad de su perro es: "+ edad_humano);
    }
}