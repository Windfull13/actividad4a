package Prognivel2;

import javax.swing.*;

public class Ej2 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPar(num))
            mensaje = "el numero " + num + " es par ";
        else
            mensaje = "el numero " + num + " no es par ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
