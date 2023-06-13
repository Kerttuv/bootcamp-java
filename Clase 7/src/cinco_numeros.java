import java.util.Scanner;
public class cinco_numeros {
    /*Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/


    /*Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números
     y se divide por 5, ya que el usuario agregó 5 números.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // arreglo para almacenar los números
        int[] numeros = new int[5];

        System.out.println("Ingresa 5 números:");

        // alojar en el arreglo los numeros ingresados
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");

        // Mostrar los números ingresados por el usuario
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);

             /*Después de realizar el ejercicio anterior, agregar que muestre el número
            mayor y el número menor.*/

            int mayor = numeros[0];
            int menor = numeros[0];

            for (int num : numeros) {
                if (num > mayor) {
                    mayor = num;
                }

                if (num < menor) {
                    menor = num;
                }
            }

            // Mostrar el número mayor y el número menor
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
                }
            }


}

