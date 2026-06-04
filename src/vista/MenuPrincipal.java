/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorMatematico;
import controlador.ControladorCadenas;
import controlador.ControladorLogica;
import javax.swing.JOptionPane;

/**
 *
 * @author Gregory Jeronimo
 */
public class MenuPrincipal {
    public void mostrarMenu() {

        String opcion;

        do {

            opcion = JOptionPane.showInputDialog(
                    "1. Operaciones Matemáticas\n"
                    + "2. Cadenas\n"
                    + "3. Lógica\n"
                    + "4. Salir");

            switch (opcion) {

                case "1":
                    new ControladorMatematico().menuMatematico();
                    break;

                case "2":
                    new ControladorCadenas().menuCadenas();
                    break;

                case "3":
                    new ControladorLogica().menuLogica();
                    break;

            }

        } while (!opcion.equals("4"));
    }
}
