package Prognivel2;

import javax.swing.*;

public class Ej16 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esCompuesto(num))
            mensaje = "el numero " + num + " si es compuesto ";
        else
            mensaje = "el numero " + num + " no es compuesto ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}