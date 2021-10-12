public class MayorNNumeros {
    public static void main(String[] args) {
        int[] numbers = {25, 33, 2, 56, -3, 27, 10, 34, 19, 0, 12};

        int highest = numbers[0];
        for (int i = 0; i < numbers.length; i++ ) {
            if (highest < numbers[i]) {
                highest = numbers[i];
            }
        }
        
        System.out.println("El número mayor es: " + highest);
    }   
}
