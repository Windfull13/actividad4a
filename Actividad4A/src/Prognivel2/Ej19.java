package Prognivel2;

import javax.swing.*;

public class Ej19 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPerfecto(num))
            mensaje = "el numero " + num + " si es perfecto ";
        else
            mensaje = "el numero " + num + " no es perfecto ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}