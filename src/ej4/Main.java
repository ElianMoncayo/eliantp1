package ej4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        int num = sc.nextInt();

        while (!(num > 0)) {
            System.out.println("Escriba un numero mayor a 0");
            num = sc.nextInt();
        }

        System.out.println("Divisores: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                //imprimes la solucion
                System.out.print(i + ", ");

            }
        }
    }

}
