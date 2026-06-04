/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
// "003 commit Promedio Academico"
/**
 *
 * @author Gregory Jeronimo
 */
public class PromedioAcademico {
     public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2:"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3:"));

        double promedio = (n1 + n2 + n3) / 3;

        JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
    }
    
}
