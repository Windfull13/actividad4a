package Prognivel2;

import javax.swing.*;

public class Ej20 {
    public static void main(String[] args) {
        String mensaje = "";
        int num1 = 0;
        int num2 = 0;

        mensaje = "Ingrese un numero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese otro numero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.sonAmigos(num1,num2))
            mensaje = "los numeros " + num1 + " y " +num2+ " si son amigos ";
        else
            mensaje = "los numeros " + num1 + " y " +num2+ " no son amigos ";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}