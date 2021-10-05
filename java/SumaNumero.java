import java.util.Scanner;

public class SumaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Ingrese el número: ");
        number = input.nextInt();

        System.out.println("El número final es: " + sumNumber(number));
        
        input.close();
    }

    public static int sumNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println(sum + " " + i);
            sum += i;
        }
        return sum;
    }
}