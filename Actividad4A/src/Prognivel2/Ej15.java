package Prognivel2;

import javax.swing.*;

public class Ej15 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int sumdivisores = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sumdivisores=Funciones.sumDivisores(num);

        mensaje="La suma de los divisores de este numero son: "+sumdivisores;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}