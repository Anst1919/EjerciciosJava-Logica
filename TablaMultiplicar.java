import java.util.Scanner;  // Importamos la clase Scanner para poder leer datos desde el teclado

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int numero;

        // Pedimos al usuario un número entre 1 y 10
        System.out.print("Introduce un número del 1 al 10: ");
        numero = scanner.nextInt();  // Leemos el número ingresado

        // Validamos que el número esté dentro del rango permitido
        if (numero >= 1 && numero <= 10) {
            // Mostramos la tabla de multiplicar del número ingresado
            System.out.println("Tabla de multiplicar del " + numero + ":");

            // Usamos un bucle for para multiplicar el número del 1 al 10
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;  // Calculamos el resultado
                System.out.println(numero + " x " + i + " = " + resultado);  // Mostramos el resultado
            }
        } else {
            // Si el número no está en el rango, mostramos un mensaje de error
            System.out.println("Error: Debes ingresar un número entre 1 y 10.");
        }

        scanner.close();  // Cerramos el objeto Scanner
    }
}