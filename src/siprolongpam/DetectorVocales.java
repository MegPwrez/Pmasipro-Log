/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;

/**
 *
 * @author Amanda Pérez
 */
public class DetectorVocales {
     public static void main(String[] args) {

        char letra = JOptionPane.showInputDialog("Ingrese una letra:")
                .toLowerCase().charAt(0);

        boolean esVocal = (letra == 'a' || letra == 'e' ||
                           letra == 'i' || letra == 'o' ||
                           letra == 'u');

        JOptionPane.showMessageDialog(null,
                "¿Es vocal? " + esVocal);
    }
}
