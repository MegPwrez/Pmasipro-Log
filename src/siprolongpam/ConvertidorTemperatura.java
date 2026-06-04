/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "004 commit Convertidor de temperatura"
/**
 *
 * @author Gregory Jeronimo
 */
public class ConvertidorTemperatura {
    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese grados Celsius:"));

        double fahrenheit = (celsius * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null, "Grados Fahrenheit: " + fahrenheit);
    }
    
}
