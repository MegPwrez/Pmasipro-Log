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
public class AnioBisiesto {
     public static void main(String[] args) {

        int ano = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un año:"));

        boolean bisiesto = (ano % 4 == 0 && ano % 100 != 0)
                || (ano % 400 == 0);

        JOptionPane.showMessageDialog(null,
                "¿Es bisiesto? " + bisiesto);
    }
}
