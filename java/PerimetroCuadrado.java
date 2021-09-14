import java.util.Scanner; // lib para leer datos

// Calcula un perímetro de un cuadrado
public class PerimetroCuadrado {
    // La rutina principal
    public static void main(String [] args) {
        // Este es el input de la terminal
        Scanner input = new Scanner(System.in);
        // Declara las variables que vamos a usar
        int x, p;
        int LADOS = 4;

        // Imprime y espera la respuesta
        System.out.print("Ingresa la longitud del lado: ");
        // Lee el entero de la terminal
        x = input.nextInt();

        // Calcula el perímetro
        p = LADOS * x;

        // Imprime el resultado
        System.out.println("El perímetro cuadrado es: " + p);
        
        // Evita Memory Leaks
        input.close();
    }
}
