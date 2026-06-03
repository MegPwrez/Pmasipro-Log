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
public class ValidadorPassword {
     public static void main(String[] args) {

        String password = JOptionPane.showInputDialog("Ingrese una contraseña:");

        if (password.length() > 8) {
            JOptionPane.showMessageDialog(null, "Segura");
        } else {
            JOptionPane.showMessageDialog(null, "Insegura");
        }
    }
}
