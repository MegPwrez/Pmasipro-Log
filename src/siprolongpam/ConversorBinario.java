/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "017 commit Conversor Binario"
/**
 *
 * @author Gregory Jeronimo
 */
public class ConversorBinario {
     public static void main(String[] args) {

        String binario = JOptionPane.showInputDialog("Ingrese una cadena de 0 y 1:");

        String resultado;

        if (binario.length() % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        JOptionPane.showMessageDialog(null,
                "La longitud es: " + resultado);
    }
    
}
