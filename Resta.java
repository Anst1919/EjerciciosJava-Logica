public class Resta {
    //Definir un metodo - Metodo es la manera de ejecutar una funcion

    //Dentro de los parentesis nosotros podemos N cantidad de argumentos
    //Es decir tu puedes pasar los valores que tu desees
    void resta (double a, double b, double c){
        System.out.println("El valor que llega como parametro A es: " + a);
        System.out.println("El valor que llega como parametro B es: " + b);
        System.out.println("El valor que llega como parametro C es: " + c);

        double valorDeLaOperacion = a-b-c;

        System.out.println("El valor de la operacion es: " + valorDeLaOperacion);
    }
}
