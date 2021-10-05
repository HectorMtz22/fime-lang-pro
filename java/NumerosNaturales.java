import java.util.Scanner;

public class NumerosNaturales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Ingrese el total de números: ");
        number = input.nextInt();

        printNumbers(number);

        input.close();
    }

    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}