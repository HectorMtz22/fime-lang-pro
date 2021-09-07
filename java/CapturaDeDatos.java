/*
    Nombre: Héctor Mauricio Flores Martínez
*/

import java.util.Scanner;
public class CapturaDeDatos {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        String nombre;
        System.out.print("Ingresa tu nombre: ");
        nombre = lec.nextLine();
        System.out.println("Hola, " + nombre);
        // For closing Scanner and solve Memory Leak
        lec.close();
    }
}