public class InstruccionesDeControl { // Define la clase principal con el mismo nombre del archivo
    public static void main(String[] args) { // Método principal donde inicia la ejecución del programa
        int numero = 10; // Declara una variable entera llamada 'numero' y le asigna el valor 10

        // instrucciones if
        if (numero > 5) { // Verifica si 'numero' es mayor que 5
            System.out.println("El número es mayor que 5"); // Si la condición se cumple, imprime este mensaje
        }
        if (numero < 20) { // Verifica si 'numero' es menor que 20
            System.out.println("El número es menor que 20"); // Si la condición se cumple, imprime este mensaje
        }

        // instrucciones if-else
        if (numero % 2 == 0) { // Verifica si 'numero' es par (el residuo de dividir entre 2 es 0)
            System.out.println("El número es par"); // Si es par, imprime este mensaje
        } else { // Si no se cumple la condición anterior (es impar)
            System.out.println("El número es impar"); // Imprime este mensaje
        }

        if (numero == 10) { // Verifica si 'numero' es igual a 10
            System.out.println("El número es exactamente 10"); // Si es igual a 10, imprime este mensaje
        } else { // Si no es igual a 10
            System.out.println("El número no es 10"); // Imprime este mensaje
        }

        // instrucción for
        for (int i = 0; i < 3; i++) { // Bucle que se repite 3 veces: i toma los valores 0, 1 y 2
            System.out.println("Iteración del for: " + i); // Imprime el valor de 'i' en cada iteración
        }

        // instrucción do-while
        int contador = 0; // Declara una variable llamada 'contador' y la inicializa en 0
        do { // Ejecuta este bloque al menos una vez
            System.out.println("Iteración do-while: " + contador); // Imprime el valor de 'contador'
            contador++; // Incrementa el valor de 'contador' en 1
        } while (contador < 1); // Repite el bloque mientras 'contador' sea menor que 1

        // instrucción break
        for (int i = 0; i < 5; i++) { // Bucle que puede repetirse hasta que i sea 4
            if (i == 3) { // Verifica si 'i' es igual a 3
                System.out.println("Se alcanzó el valor 3, se interrumpe el bucle"); // Imprime mensaje
                break; // Sale del bucle for cuando 'i' es 3
            }
            System.out.println("i = " + i); // Imprime el valor actual de 'i' en cada iteración
        }
    }
}
