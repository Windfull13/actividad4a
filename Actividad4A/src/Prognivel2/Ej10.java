package Prognivel2;

import javax.swing.*;

public class Ej10 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int cantdivisorespos = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        cantdivisorespos=Funciones.cantDivisoresPos(num);

        mensaje="La cantidad de divisores positivos de este numero son: "+cantdivisorespos;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}