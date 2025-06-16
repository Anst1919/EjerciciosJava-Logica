import javax.swing.JOptionPane;

public class MultiplicacionUI {
    public static void main(String[] args) {
        // Capturar el primer número
        String numero1Texto = JOptionPane.showInputDialog("Ingresa el primer número:");

        // Capturar el segundo número
        String numero2Texto = JOptionPane.showInputDialog("Ingresa el segundo número:");

        // Convertir los textos a enteros
        int numero1 = Integer.parseInt(numero1Texto);
        int numero2 = Integer.parseInt(numero2Texto);

        // Realizar la multiplicación
        int resultado = numero1 * numero2;

        // Mostrar el resultado
        String mensaje = String.format("La multiplicación de %d * %d es: %d", numero1, numero2, resultado);
        JOptionPane.showMessageDialog(null, mensaje);
 }
}