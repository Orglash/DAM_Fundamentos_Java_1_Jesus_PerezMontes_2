package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Introduzca el radio para el circulo en cm:\n");
        Scanner radio=new Scanner(System.in);
        double r=radio.nextDouble();
        double area= Math.PI * Math.pow(r, 2);
        System.out.printf("El area del circulo resultante con radio %fcm es igual a:  %fcm\n", r, area);
    }
}
