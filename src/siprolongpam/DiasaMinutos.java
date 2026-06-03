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
public class DiasaMinutos {
     public static void main(String[] args) {

        int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de días:"));

        int minutos = dias * 24 * 60;

        JOptionPane.showMessageDialog(null, "Minutos totales: " + minutos);
    }
    
}
