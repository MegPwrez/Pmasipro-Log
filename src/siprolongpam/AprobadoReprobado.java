/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;
//"028 commit Aprobado o Reprobado"
/**
 *
 * @author Gregory Jeronmo
 */
public class AprobadoReprobado {
      public static void main(String[] args) {

        double nota = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese la nota final:"));

        boolean aprobado = nota >= 60;

        JOptionPane.showMessageDialog(null,
                "¿Aprobó? " + aprobado);
    }
}
