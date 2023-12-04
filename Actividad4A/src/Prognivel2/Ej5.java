package Prognivel2;

import javax.swing.*;

public class Ej5 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esNegativo(num))
            mensaje = "el numero " + num + " si es negativo ";
        else
            mensaje = "el numero " + num + " no es negativo ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}