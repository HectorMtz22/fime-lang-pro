import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {
        String municipioactual = "MONTERREY";
        int personasTotales = 0;
        int personasVacunadas = 0;
        int rango18a29 = 0;
        int rango29a40 = 0;
        int rango40a60 = 0;
        int rango60omas = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Vacunación Gobierno");

        
        int opciones = 1;
        do {
            String municipio;
            String nombre;
            int edad;
            System.out.println("Menú del Programa\nSelecciona 1 para capturar una persona\nSelecciona 2 para salir del sistema");
            opciones = input.nextInt();
            if (opciones != 1) {
                break;
            }
            
            System.out.println("Ingrese su nombre: ");
            nombre = input.next();
            personasTotales++;

            System.out.println("Ingrese su edad: ");
            edad = input.nextInt();

            System.out.print("Ingrese su municipio (en mayúsculas): ");
            municipio = input.next();

            if (!municipio.equals("MONTERREY")) {
                System.out.println("Lo sentimos, esta jornada es solo para Monterrey.");
                continue;
            }

            if (edad < 29) {
                rango18a29++;
            } else if (edad < 40) {
                rango29a40++;
            } else if (edad < 60) {
                rango40a60++;
            } else {
                rango60omas++;
            }

            personasVacunadas++;
        } while (opciones == 1);

        System.out.println("Personas totales: " + personasTotales);
        System.out.println("Personas Vacunadas: " + personasVacunadas);
        System.out.println("Rango 18 a 29: " + rango18a29);
        System.out.println("Rango 29 a 40: " + rango29a40);
        System.out.println("Rango 40 a 60: " + rango40a60);
        System.out.println("Rango 60 y mas: " + rango60omas);
        System.out.println("Personas que no se pudieron vacunar: " + (personasTotales - personasVacunadas));


        input.close();
    }
}