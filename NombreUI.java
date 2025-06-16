import javax.swing.JOptionPane;

public class NombreUI {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Como te llamas?");

        //Creamos un mensaje  y lo que vamos a hacer es tomar la variable nombre
        String mensaje = String.format("Mucho gusto %s", nombre);

        //Paso final - Ver el resultado en un cuadro de dialogo
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
