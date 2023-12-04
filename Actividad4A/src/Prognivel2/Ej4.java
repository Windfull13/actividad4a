package Prognivel2;

import javax.swing.*;

public class Ej4 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPositivo(num))
            mensaje = "el numero " + num + " si es positivo ";
        else
            mensaje = "el numero " + num + " no es positivo ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}