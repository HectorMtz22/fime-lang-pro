import java.util.Scanner;

public class punto4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números de la serie: ");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i+=2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        input.close();
    }
    
}
