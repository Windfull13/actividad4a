package Prognivel2;

import javax.swing.*;

public class Ej7 {
    public static void main(String[] args) {
        String mensaje = "";
        int num1 = 0;
        int num2 = 0;
        int menor = 0;

        mensaje = "Ingrese el primer numero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        menor=Funciones.menor(num1, num2);

        mensaje="El numero menor es: "+menor;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}