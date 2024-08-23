package Tarea;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio03 {
    public static void main(String[] args) { 
    //declarar variables
    double alturaplat,alturacast,alturaniño,alturaf,distnc,distnpc;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingrese la altura de la plataforma:" );
    alturaplat=lectura.nextDouble();
    System.out.print("Ingrese la altura del castillo:" );
    alturacast=lectura.nextDouble();
    System.out.print("Ingrese la altura del niño:" );
    alturaniño=lectura.nextDouble();
    System.out.print("Ingrese la distancia niño - castillo:" );
    distnc=lectura.nextDouble();
    //proceso de datos
    alturaf=alturacast-(alturaplat+alturaniño);
    distnpc=Math.hypot(alturaf,distnc);
    //salida de datos
    System.out.println("El resultado es el siguiente: " );
    System.out.println("La distancia entre el niño y el pico de la torre más alta del catillo es: " +distnpc);
    }
}
