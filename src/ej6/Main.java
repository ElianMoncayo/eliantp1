package ej6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar dos numeros enteros positivos: ");
        //System.out.print("Numero1: ");
        ArrayList<Integer> arr = new ArrayList();
        /*for (int i = 0; i < 2; i++) {
            if (i == 1) {
                System.out.print("Numero2: ");
            }
            arr.add(sc.nextInt());
            while (!(arr.get(i) > 0)) {
                System.out.println("Escriba un numero mayor a 0");
                System.out.print("Numero" + i + ": ");
                arr.add(sc.nextInt());
            }
        }*/

        for (int i = 0; i < 2; i++) {
            int num;
            System.out.print("Numero" + (i+1) + ": ");
            num = sc.nextInt();
            while (!(num > 0) || arr.contains(num)) {
                System.out.println("Escriba un numero mayor a 0 o distinyo al anterior");
                System.out.print("Numero" + i + ": ");
                num = sc.nextInt();
            }
            arr.add(num);
        }

        /*
        int num = sc.nextInt();


        while(!(num > 0)){
                            System.out.println("Escriba un numero mayor a 0");
                            System.out.print("Numero1: ");
                            num = sc.nextInt();
                        }

        System.out.print("Numero2: ");
        int num2 = sc.nextInt();

        

        while(!(num2 > 0 && num2 != num)){                           
                            System.out.println("Escriba un numero mayor a 0 y distinto del primero ingresado");
                            System.out.print("Numero2: ");
                            num2 = sc.nextInt();
                        }
        
        
         */
        int mayor, menor;
        if (arr.get(0) > arr.get(1)) {
            mayor = arr.get(0);
            menor = arr.get(1);
        } else {
            mayor = arr.get(1);
            menor = arr.get(0);
        }
        float res = 0;

        for (int i = menor + 1; i < mayor; i++) {
            if (i % 5 == 0) {
                res = res + i;
                //System.out.println(res);
            }

        }

        System.out.println("Suma de todos los multiplos de 5: " + res);
    }

}
