/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "005 commit Perimetro Circulo"
/**
 *
 * @author Gregory Jeronimo
 */
public class PerimetroCirculo {
      public static void main(String[] args) {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio:"));

        double perimetro = 2 * Math.PI * radio;

        JOptionPane.showMessageDialog(null, "Perímetro: " + perimetro);
    }
}
