package GitPractica;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main (String[] args) {
        //Creamos un objeto scanner que tomara los valores de entrada por consola
        Scanner scan = new Scanner (System.in);
        int continuar = 1;
    
        while (continuar==1) {
            System.out.println("Por favor,ingrese un número: ");
            int a= scan.nextInt(); //Escanea el proximo entero que es ingresado
            System.out.println(a+" es el número ingresado ");

            System.out.println ("Si desea continuar presione 1, sino cualquier otro número");
            continuar= scan.nextInt(); // Escanea el nro y lo asigna a la variable para evaluar, luego si continua o no
         
        }

        scan.close(); //Cerramos el scanner si no lo usamos mas (buena practica)
    }  
    //¿es como que el input(scan) es una clase?
}
