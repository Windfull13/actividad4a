package Prognivel2;

import javax.swing.*;

public class Ej18 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int primorial = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        primorial=Funciones.Primorial(num);

        mensaje="EL primorial de este numero es: "+primorial;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}