import java.util.Scanner;

public class SumaElementosVectores {
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

        input.close();


        int suma = 0;
        for(i = 0; i < n; i++) {
            suma += A[i];
        }

        System.out.println("La suma de ese vector es: " + suma);

    }
    
}

