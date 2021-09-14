import java.util.Scanner; // Lib para inputs

public class ParImpar {
    public static void main(String[] args) {
        // Utilizamos el Scanner
        Scanner input = new Scanner(System.in);

        // Lo mismo de siempre
        System.out.print("Ingresa un número: ");
        int number = input.nextInt();

        // Llama a la función
        isPar(number);

        // Cierra el Scanner
        input.close();

    }

    // Subrutina que devuelve si es par o no
    public static void isPar(int number) {
        System.out.print("El número es: ");
        if (number % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
    
}
