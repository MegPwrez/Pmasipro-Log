/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;

// "0002 commit Area triangulo"
/**
 *
 * @author Gregory Jeronimo
 */
public class AreaTriangulo {
     public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura:"));

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null, "Área del triángulo: " + area);
    }
    
}
