import java.util.Scanner;

public class ArregloLeerImprimir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n;
        int[] A;

        System.out.print("Ingrese el total de números: ");
        n = input.nextInt();
        A = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = input.nextInt();
        }

        System.out.print("A = [");

        for(i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("]");

        input.close();
    }
    
}
