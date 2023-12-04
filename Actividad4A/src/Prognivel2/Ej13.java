package Prognivel2;

import javax.swing.*;

public class Ej13 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int sumdivisorespos = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisorespos=Funciones.sumDivisoresPos(num);

        mensaje="La suma de los divisores positivos de este numero son: "+sumdivisorespos;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}