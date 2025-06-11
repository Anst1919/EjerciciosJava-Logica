import java.util.Scanner;
public class Ejercicios {
    Scanner teclado = new Scanner (System.in);

    //En la parte mas alta se declaran los argumentos y variables
    int calificacion = 4; // Calificacion de un estudiante
    public static void main (String[]args){
        //Voy a crear una instancia para poder acceder a la variable
        // calificacion
        Ejercicios ejercicioUno = new Ejercicios();

        System.out.println(ejercicioUno.calificacion);
        //Aqui ya que conozca el numero, puedo hacer una evaluacion
        // de tipo if - else (Si - de lo contrario)

        if (ejercicioUno.calificacion <= 5){
            System.out.println("Estás reprobado");
        } else {
            System.out.println("Estás aprobado, sigue así");
        }
    }
}
