//5.	Desarrollar un programa que dado un número entero ingresado, nos retorne los valores de ese 
// número multiplicado por 1, 2, 3, … y 10.

package GitPractica;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String [] args) {
        Scanner scan =new Scanner (System.in);
        int nro = scan.nextInt ();
        scan.close();

        for (int i=1;i <= 10; i++) {
            System.out.println(nro + " * " + i + " = " + nro*i);

        }
    }
    
}
