package Tarea;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio02 {
    public static void main(String[] args) { 
    //declarar variables
    double vinicial,vfinal,tiempo,aceleración,distrecorrida;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingrese la velocidad inicial:" );
    vinicial=lectura.nextDouble();
    System.out.print("Ingrese el tiempo de recorrido:" );
    tiempo=lectura.nextDouble();
    System.out.print("Ingrese la aceleración:" );
    aceleración=lectura.nextDouble();
    //proceso de datos
    distrecorrida=(vinicial*tiempo)+((aceleración*Math.pow(tiempo,2))/2);
    vfinal=Math.sqrt((Math.pow(vinicial,2)+(2*aceleración*distrecorrida)));
    //salida de datos
    System.out.println("Los resultados son los siguientes: " );
    System.out.println("La distancia recorrida es: " +distrecorrida);
    System.out.println("La velocidad final del cuerpo es: " +vfinal);
    }
}
