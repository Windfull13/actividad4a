package Prognivel2;

import javax.swing.*;

public class Ej3 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esImpar(num))
            mensaje = "el numero " + num + " si es impar ";
        else
            mensaje = "el numero " + num + " no es impar ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}