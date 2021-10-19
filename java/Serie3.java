import java.util.Scanner;

public class Serie3 {
    public static void main(String[] args) {
        int k = 2;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            k = k * i;
            System.out.print(k + ", ");
        }
        System.out.println();

        input.close();
    }
}