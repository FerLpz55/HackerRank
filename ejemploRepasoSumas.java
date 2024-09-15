import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemploRepasoSumas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Variable para controlar si el programa sigue ejecutándose

        while (continuar) {
            boolean valido = false;
            int num1 = 0;
            int num2 = 0;

            // Solicitar números al usuario hasta que se ingresen correctamente
            while (!valido) {
                try {
                    System.out.println("Ingrese el primer número: ");
                    num1 = scanner.nextInt();

                    System.out.println("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();

                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: ingrese solo números enteros. Intente de nuevo por favor.");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                }
            }

            // Calcular y mostrar el resultado
            int resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);

            // Preguntar al usuario si desea ejecutar el proceso nuevamente
            System.out.println("¿Desea realizar otra operación? (sí/no)");
            String respuesta = scanner.next().trim().toLowerCase();

            if (!respuesta.equals("sí") && !respuesta.equals("si")) {
                continuar = false; // Terminar el bucle principal si la respuesta es diferente de "sí"
            }
        }

        // Cerrar el scanner
        scanner.close();
        System.out.println("Programa terminado.");
    }
}

