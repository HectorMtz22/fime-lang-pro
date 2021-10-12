import java.util.Arrays;
import java.util.Scanner;

public class SerieImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números: ");
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = (i * 2) + 1;
        }
        System.out.println(Arrays.toString(list));

        input.close();
    }
}
