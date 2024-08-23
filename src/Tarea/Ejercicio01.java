package Tarea;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio01 {
    public static void main(String[] args) { 
    //declarar variables
    double vcilindro,radio,altura;
    Scanner lectura=new Scanner(System.in);
    //ingreso de datos
    System.out.print("Ingrese el radio de la circunferencia: ");
    radio=lectura.nextDouble();
    //proceso de datos
    altura=3*radio;
    vcilindro=Math.PI*Math.pow(radio,2)*altura;
    //salida de datos
    System.out.println("El resultado es el siguiente: ");
    System.out.println("El volumen del cilindro es: " +vcilindro);
    }
}
