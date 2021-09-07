import javax.swing.JOptionPane;

public class UsoDiagBox {
    public static void main(String[] args) {
        String entrada;
        String nombre;
        entrada = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        nombre = entrada;
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);
    }  
}
