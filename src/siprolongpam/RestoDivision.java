/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "009 commit Resto de Division"
/**
 *
 * @author Gregory Jeronimo
 */
public class RestoDivision {
    public static void main(String[] args) {

        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dividendo:"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese divisor:"));

        int residuo = dividendo % divisor;

        JOptionPane.showMessageDialog(null, "Residuo: " + residuo);
    }
    
}
