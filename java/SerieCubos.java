import java.util.Scanner;
import java.util.Arrays;

public class SerieCubos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Ingresa un número: ");
            n = input.nextInt();
        } while (n <= 0);

        int[] list = new int[n];

        for (int i = 1; i <= n; i++) {
            list[i - 1] = (int) Math.pow(i, 3);
        }
        System.out.println(Arrays.toString(list));

        input.close();
    }
    
}
