/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
/**
 *
 * @author Gregory Jeronimo
 */
public class ConcatenadorNombre {
     public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        String nombreCompleto = nombre + " " + apellido;

        JOptionPane.showMessageDialog(null,
                "Nombre Completo: " + nombreCompleto);
    }
}
