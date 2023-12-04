package Prognivel2;

import javax.swing.*;

public class Ej14 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int sumdivisoresneg = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisoresneg=Funciones.sumDivisoresNeg(num);

        mensaje="La suma de los divisores negativos de este numero son: "+sumdivisoresneg;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}