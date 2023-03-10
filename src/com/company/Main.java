package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer = new Scanner(System.in);
        int a, b, c, mayor;
        System.out.println("Ingrese el primer numero = ");
        a = leer.nextInt();

        System.out.println("Ingrese el segundo numero = ");
        b = leer.nextInt();

        System.out.println("Ingrese el tercer numero = ");
        c = leer.nextInt();

        if (a > b){
            mayor = a;
        } else{
            mayor = b;
        }

        if (c > mayor){
            mayor = c;
        }
        System.out.println("Numero mayor es: " + mayor);

    }
}
