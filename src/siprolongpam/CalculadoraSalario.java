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
public class CalculadoraSalario {
      public static void main(String[] args) {

        double horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese horas trabajadas:"));
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese pago por hora:"));

        double salario = horas * pago;

        JOptionPane.showMessageDialog(null, "Salario Total: Q" + salario);
    }
    
}
