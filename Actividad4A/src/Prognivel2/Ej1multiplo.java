package Prognivel2;

import javax.swing.*;

public class Ej1multiplo {
    public static void main(String[] args) {
        String mensaje = "";
        int num1 = 0;
        int num2 = 0;

        mensaje = "Ingrese el primer numero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if(Funciones.esMultiplo(num1,num2))
            mensaje= num1+ " si es multiplo de "+num2;
        else
            mensaje= num1+ " no es multiplo de "+num2;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
