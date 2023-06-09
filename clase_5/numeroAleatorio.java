//Adivina un numero entre 1 y 100

package clase_5;

import java.util.Random;
import java.util.Scanner;
public class numeroAleatorio {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner entrada= new Scanner(System.in);
        int usuario = 0;

        int numero = random.nextInt(100)+1;


        do{
            System.out.println("Adivina un numero del 1 al 100");
            usuario = entrada.nextInt();
            //
            if (usuario == numero) {
                System.out.println("Adiviniaste el numero");
            }
            else {
                if(usuario<numero){
                    System.out.println("el numero a adivinar es mayor");
                }else{
                    System.out.println("el numero a adivinar es menor");
                }

            }
            } while (usuario != numero);

    }
}
