/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "018 commit repetidor de palabras"
/**
 *
 * @author Gregory Jeronimo
 */
public class RepetidorPalabras {
      public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        int n = Integer.parseInt(
                JOptionPane.showInputDialog("¿Cuántas veces desea repetirla?"));

        String resultado = "";

        for (int i = 1; i <= n; i++) {
            resultado += palabra + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
