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
public class LoginSimple {
     public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog("Usuario:");
        String password = JOptionPane.showInputDialog("Contraseña:");

        boolean acceso = usuario.equals("admin")
                && password.equals("1234");

        JOptionPane.showMessageDialog(null,
                "Acceso permitido: " + acceso);
    }
}
