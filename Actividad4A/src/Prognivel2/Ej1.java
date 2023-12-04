package Prognivel2;

import javax.swing.*;

public class Ej1 {
    public static void main(String[] args) {
        String mensaje = "";
        int num1 = 0;
        int num2 = 0;

        mensaje = "Ingrese el primer numero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if(Funciones.esDivisor(num1,num2))
            mensaje= num1+ " si es divisible por "+num2;
        else
            mensaje= num1+ " no es divisible por "+num2;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
