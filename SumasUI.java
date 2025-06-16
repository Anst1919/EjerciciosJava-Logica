import javax.swing.JOptionPane;

public class SumasUI {
    public static void main(String[] args) {
        //En esta esta actividad echarás a andar tu logica
        // Vas a tener que capturar dos tipos de números a traves de los cuadros de dialogo
        // Y Finalmente en un cuadro de Mensaje mostrarás el resultado de la operación
        //Tiempo: 15 min)
                String numero1Texto = JOptionPane.showInputDialog("Ingresa el primer número:");

                // Capturamos el segundo número como texto
                String numero2Texto = JOptionPane.showInputDialog("Ingresa el segundo número:");

                // Convertimos los textos a números enteros
                int numero1 = Integer.parseInt(numero1Texto);
                int numero2 = Integer.parseInt(numero2Texto);

                // Realizamos la suma
                int suma = numero1 + numero2;

                // Mostramos el resultado en un cuadro de diálogo
                String mensaje = String.format("La suma de %d + %d es: %d", numero1, numero2, suma);
                JOptionPane.showMessageDialog(null, mensaje);
    }
}
