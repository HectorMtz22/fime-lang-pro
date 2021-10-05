import java.util.Scanner;
public class UsoDeSwitch {
    public static void main(String[] args) {
        int input, number;
        String LETRERO = "\nMenú de Opciones\n1. Lista de Números Naturales\n2. Suma de Numeros Naturales\n";
        Scanner sysInput = new Scanner(System.in);
        
        System.out.print(LETRERO + "Selecciona una opción: ");
        input = sysInput.nextInt();

        System.out.print("Ingresa un número: ");
        number = sysInput.nextInt();
        
        switch (input) {
            case 1:
                printNumbers(number);
                break;

            case 2:

                System.out.println(SumaNumero.sumNumber(number));
                break;

            default: 
                System.out.println("Opción inválida");
                break;
        }


        sysInput.close();
    }

    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    // public static int sumNumber(int number) {
    //     int sum = 0;

    //     for (int i = 1; i <= number; i++) {
    //         System.out.println(sum + " " + i);
    //         sum += i;
    //     }
    //     return sum;
    // }
    
}