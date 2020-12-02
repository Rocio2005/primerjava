package GitPractica;

import java.util.*;

public class Ejercicio2 {

    public static void main (String[] args) {
        //Creamos un objeto Scanner que tomara los valores de entrada por consola
        
        Scanner scan= new Scanner(System.in);
        int seguir = 1;
        while (seguir==1){
            System.out.println("Ingrese un número");
            int a=scan.nextInt(); //Escanea el proximo entero que es ingresado
            System.out.println("Ingrese otro número");
            int b=scan.nextInt();//Que sucede si ingresamos un string u otro tipo?
            System.out.println("Ingrese otro");
            int c=scan.nextInt();

            System.out.println("El primer nro ingresado es: " +a);
            System.out.println("El segundo nro ingresado es: " +b);
            System.out.println("El tercer nro ingresado es: " +c);
            System.out.println("¿Desea continuar probando?, presione 1------>SI o cualquier otra tecla------>NO " );
            seguir=scan.nextInt();
           
        }
        scan.close();
        
    }

}