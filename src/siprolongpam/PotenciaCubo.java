/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siprolongpam;
import javax.swing.JOptionPane;

/**
 *
 * @author GregoryJeronimo
 */
public class PotenciaCubo {
     public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));

        double cubo = Math.pow(numero, 3);

        JOptionPane.showMessageDialog(null, "Número al cubo: " + cubo);
    }
}
