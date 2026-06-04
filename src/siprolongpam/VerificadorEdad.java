/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "021 commit Verificador de Edad"
/**
 *
 * @author Gregory Jeronimo
 */
public class VerificadorEdad {
     public static void main(String[] args) {

        int edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su edad:"));

        boolean mayorEdad = edad >= 18;

        JOptionPane.showMessageDialog(null,
                "¿Es mayor de edad? " + mayorEdad);
    }
    
}
