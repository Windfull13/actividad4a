package Prognivel2;

import javax.swing.*;

public class Ej12 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int cantdivisores = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        cantdivisores=Funciones.cantDivisores(num);

        mensaje="La cantidad de divisores de este numero son: "+cantdivisores;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}