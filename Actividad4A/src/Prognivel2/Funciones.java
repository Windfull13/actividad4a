package Prognivel2;

import java.util.Random;

public class Funciones {

    public static boolean esDivisible(int dividendo, int divisor) {
        boolean esDivisible = (dividendo % divisor == 0);
        return esDivisible;
    }

    public static boolean esMultiplo(int dividendo, int divisor) {
        boolean esMultiplo = esDivisible(dividendo, divisor);
        return esMultiplo;
    }

    public static boolean esDivisor(int divisor, int dividendo) {
        boolean esDivisor = esDivisible(divisor, dividendo);
        return esDivisor;
    }

    public static boolean esPar(int numero) {
        boolean esPar = (numero % 2 == 0);
        return esPar;
    }

    public static boolean esImpar(int numero) {
        boolean esImpar = (numero % 2 != 0);
        return esImpar;
    }

    public static boolean esPositivo(int numero) {
        boolean esPositivo = (numero > 0);
        return esPositivo;
    }

    public static boolean esNegativo(int numero) {
        boolean esNegativo = (numero < 0);
        return esNegativo;
    }

    public static int mayor(int num1, int num2) {
        int mayor = 0;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        return mayor;
    }

    public static int menor(int num1, int num2) {
        int menor = 0;

        if (num1 < num2) {
            menor = num1;
        } else {
            menor = num2;
        }
        return menor;
    }

    public static int factorial(int numero) {
        int factorial = 1;
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
    }

    public static int dobleFactorial(int numero) {
        int dobleFactorial = 1;
        if (esPar(numero)) {
            while (numero != 0) {
                dobleFactorial = dobleFactorial * numero;
                numero = numero - 2;
            }
        } else {
            while (numero != 1) {
                dobleFactorial = dobleFactorial * numero;
                numero = numero - 2;
            }
        }
        return dobleFactorial;
    }

    public static int cantDivisoresPos(int numero) {
        int cantDivisoresPos = 0;
        if (numero < 0) {
            numero = numero * -1;
        }
        int aux = numero;

        while (aux > 0) {
            if (numero % aux == 0) {
                cantDivisoresPos++;
                aux--;
            } else {
                aux--;
            }
        }
        return cantDivisoresPos;
    }

    public static int cantDivisoresNeg(int numero) {
        int cantDivisoresNeg = cantDivisoresPos(numero);

        return cantDivisoresNeg;
    }

    public static int cantDivisores(int numero){
        int cantDivisores=cantDivisoresPos(numero)+cantDivisoresNeg(numero);

        return cantDivisores;
    }

    public static int sumDivisoresPos(int numero){
        int sumDivisoresPos=0;
        if(numero<0){
            numero=numero*-1;
        }
        int aux=numero;

        while(aux>0){
            if(numero%aux==0){
                sumDivisoresPos=sumDivisoresPos+aux;
                aux--;
            }else{
                aux--;
            }
        }
        return sumDivisoresPos;
    }

    public static int sumDivisoresNeg(int numero){
        int sumDivisoresNeg=0;
        if(numero>0){
            numero=numero*-1;
        }
        int aux=numero;

        while(aux<0){
            if(numero%aux==0){
                sumDivisoresNeg=sumDivisoresNeg-aux;
                aux++;
            }else{
                aux++;
            }
        }
        return sumDivisoresNeg;
    }

    public static int sumDivisores(int numero){
        int sumDivisores=sumDivisoresNeg(numero)+sumDivisoresPos(numero);

        return sumDivisores;
    }

    public static boolean esCompuesto(int numero){
        boolean esCompuesto= false;
        if(numero<0){
            numero=numero*-1;
        }
        int aux=numero;
        do{
            if(numero%aux==0 && aux!=numero && aux!=1){
                esCompuesto=true;
                aux=0;
            }else{
                aux--;
            }
        }while(aux>0);
        return esCompuesto;
    }

    public static boolean esPrimo(int numero){
        boolean esPrimo=!esCompuesto(numero);

        return esPrimo;
    }

    public static int Primorial (int numero){
        int primorial=1;
        while (numero>0){
            if (esPrimo(numero)){
                primorial=primorial*numero;
                numero--;
            }else{
                numero--;
            }
        }
        return primorial;
    }

    public static boolean esPerfecto(int numero){
        boolean esPerfecto=false;
        int aux= sumDivisoresPos(numero)-numero;
        if (aux==numero){
            esPerfecto=true;
        }
        return esPerfecto;
    }

    public static boolean sonAmigos(int num1, int num2){
        boolean sonAmigos=false;
        int aux1= sumDivisoresPos(num1)-num1;
        int aux2= sumDivisoresPos(num2)-num2;
        if(aux1==num2 && aux2==num1){
            sonAmigos=true;
        }
        return sonAmigos;
    }

    public static int generarAleatorio(int limInf, int limSup){
        Random c=new Random();
        int generarAleatorio = c.nextInt(limInf,limSup);
        return generarAleatorio;
    }
}
