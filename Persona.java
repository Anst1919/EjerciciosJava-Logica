public class Persona {
    //Todas las personas pueden hacer muchas cosas, las personas tienen nombre, edad
    //etc, asi que vamos simular algunas actividades mediante metodos.

    //Una buena practica es declarar variables en la parte mas alta del codigo

    int edad = 20;

    void mayorDeEdad() {
        if (edad > 18) {
            System.out.println("Eres un mayor de edad 😉");
        } else {
            System.out.println("Eres un adolescente 😊");
        }
    }

    void descansar(boolean estaCansado) {
        if (estaCansado) {
            System.out.println("Vete a dormir 😴");
        } else {
            System.out.println("Sigue practicando codigo 😁");
        }
    }

    void verTelevision(boolean estaAburrido) {
        if (estaAburrido) {
            System.out.println("Puedes ver televisión un rato 😊");
        } else {
            System.out.println("No necesitas ver televisión ahora 🤗");
        }
    }

    void hacerEjercicio(boolean tieneRopaDeportiva) {
        if (tieneRopaDeportiva) {
            System.out.println("Puedes hacer ejercicio 😜");
        } else {
            System.out.println("No tienes ropa deportiva disponible 🤷‍♀️");
        }
    }

    void jugarVideojuegos(boolean hayConsola) {
        if (hayConsola) {
            System.out.println("Puedes jugar videojuegos 🎮");
        } else {
            System.out.println("No tienes consola disponible 😢");
        }
    }

    void darleComidaAlGato(boolean tieneHambre) {
        if (tieneHambre) {
            System.out.println("Puedes darle de comer al gato 🐈‍⬛🍗");
        } else {
            System.out.println("No hay comida para el gato 😿");
        }
    }

    void leerLibro(boolean hayLuz) {
        if (hayLuz) {
            System.out.println("Puedes leer un libro 📖");
        } else {
            System.out.println("Está oscuro para leer 😢");
        }
    }
}