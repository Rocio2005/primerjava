package GitPractica;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Ingrese un número de 1 a 7 ");
        int num= scan.nextInt();
        scan.close();
        if (num==1) {
            System.out.println("El dia de la semana es Lunes");
        } else if (num==2){
            System.out.println("El dia de la semana es Martes");
        } else if (num==3) {
            System.out.println("El dia de la semana es Miércoles");
        } else if (num==4) {
            System.out.println("El dia de la semana es Jueves");
        } else  if (num==5) {
            System.out.println("El dia de la semana es Viernes");
        } else if (num==6){
            System.out.println("El dia de la semana es Sábado");
        } else if (num==7){
            System.out.println("El dia de la semana es Domingo");
        } else {
            System.out.println("Fin del programa.Debe Ingresar un número de 1 a 7 ");
        }
    }
    
}

