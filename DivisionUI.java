import javax.swing.JOptionPane;

public class DivisionUI {
    public static void main(String[] args) {
        // Capturar el primer número
        String numero1Texto = JOptionPane.showInputDialog("Ingresa el numerador (dividendo):");

        // Capturar el segundo número
        String numero2Texto = JOptionPane.showInputDialog("Ingresa el denominador (divisor):");

        // Convertir los textos a números enteros
        int numero1 = Integer.parseInt(numero1Texto);
        int numero2 = Integer.parseInt(numero2Texto);

        // Validar que el divisor no sea cero para evitar error de división
        if (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "Error: no se puede dividir entre cero.");
        } else {
            // Realizar la división (usamos double para obtener decimales si es necesario)
            double resultado = (double) numero1 / numero2;

            // Mostrar el resultado
            String mensaje = String.format("La división de %d ÷ %d es: %.2f", numero1, numero2, resultado);
            JOptionPane.showMessageDialog(null, mensaje);
  }
 }
}