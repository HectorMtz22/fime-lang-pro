import java.util.Scanner;

public class MayorVectores {
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

        int mayor = mayor(n, A);
        System.out.println("El número mayor es: " + mayor);

    }

    public static int mayor(int n, int[] A) {
        int mayor = A[0];
        for(int i = 0; i < n; i++) {
            if (mayor < A[i]) {
                mayor = A[i];
            }
        }

        return mayor;


    }
    
}


