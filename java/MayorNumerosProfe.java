import java.util.Scanner;

public class MayorNumerosProfe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numbers = input.nextInt();

        System.out.print("Ingresa el número: ");
        int n = input.nextInt();

        int highest = n;
        for (int i = 1; i < numbers; i++ ) {

            System.out.print("Ingresa el número: ");
            n = input.nextInt();
            if (highest < n) {
                highest = n;
            }
        }
        
        System.out.println("El número mayor es: " + highest);
        input.close();
    }      

}
