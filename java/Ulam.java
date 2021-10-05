import java.util.Scanner;

public class Ulam {
    public static void main (String[] args) {
        int input;
        Scanner sysIn = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        input = sysIn.nextInt();

        forUlam(input);

        sysIn.close();
    }

    public static void forUlam (int number) {
        while (number != 1) {
            System.out.print(number + ", ");
            number = ulam(number);
        }
        System.out.println(number);
    }

    public static int ulam (int number) {
        // Si el número es par
        if (number % 2 == 0) {
            return number / 2;
        } else {
            return (number * 3) + 1;
        }
    }
}
