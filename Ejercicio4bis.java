package GitPractica;
import java.util.Scanner;

public class Ejercicio4bis {

    public static void main (String [] args ) {
        Scanner scan = new Scanner (System.in);
        int dia =scan.nextInt();
        scan.close();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
                
            case 2:
                System.out.println ("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println ("Miércoles");
                break;
            case 5:
                System.out.println ("Jueves");
                break;
            case 6:
                System.out.println ("Viernes");
                break;
            case 7:
                System.out.println ("Sábado");
                break;
        }
    }
    
}
// la sentencia switch(según), se basa según el caso realiza una operación.
// breack, sin el break el programa me muestra si le ingreso 4, los dias de 
//la semana a partir del cuarto dia:miércoles,jueves,viernes,sabado 