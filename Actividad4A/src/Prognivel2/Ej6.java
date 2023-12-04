package Prognivel2;

import javax.swing.*;

public class Ej6 {
    public static void main(String[] args) {
        String mensaje = "";
        int num1 = 0;
        int num2 = 0;
        int mayor = 0;

        mensaje = "Ingrese el primer numero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese el segundo numero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        mayor=Funciones.mayor(num1, num2);

        mensaje="El numero mayor es: "+mayor;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}