package ej9;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar radio: ");
        double radio= sc.nextDouble();
        
                

        while (!(radio > 0)) {
            System.out.println("Escriba un numero positivo");
            radio = sc.nextFloat();
        }

        double diametro = radio * 2;
        double circunferencia = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("Diametro = " + diametro);
        System.out.println("Circunferencia = " + circunferencia);
        System.out.println("Area = " + area);
    }

}
