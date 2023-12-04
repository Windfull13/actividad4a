package Prognivel2;

import javax.swing.*;

public class Ej8 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int factorial = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        factorial=Funciones.factorial(num);

        mensaje="El factorial de este numero es: "+factorial;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}