import java.util.Scanner;
public class CapturaNumerica {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        System.out.print("Ingresa el número entero: ");
        Integer x = lec.nextInt();

        System.out.print("Ingresa el número float: ");
        Float y = lec.nextFloat();

        System.out.print("Ingresa el número double: ");
        Double z = lec.nextDouble();

        System.out.print("Ingresa el número byte: ");
        Byte w = lec.nextByte();

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("Z = " + z);
        System.out.println("W = " + w);
        lec.close();
    }   
}
