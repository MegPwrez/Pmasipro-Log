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
public class ContadorLongitud {
     public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

        int longitud = palabra.length();

        JOptionPane.showMessageDialog(null,
                "La palabra tiene " + longitud + " letras.");
    }
}
