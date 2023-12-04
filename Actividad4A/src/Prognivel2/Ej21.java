package Prognivel2;

import javax.swing.*;

public class Ej21 {
    public static void main(String[] args) {
        String mensaje = "";
        int liminf = 0;
        int limsup = 0;
        int numAleat = 0;

        mensaje = "Ingrese un limite inferior";
        liminf = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "Ingrese un limite superior";
        limsup = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        numAleat=Funciones.generarAleatorio(liminf, limsup);

        mensaje="EL numero aleatorio en el rango generado es: "+numAleat;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}