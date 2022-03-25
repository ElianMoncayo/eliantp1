package ej1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar 3 numeros por teclado: ");

        for (int i = 0; i < 3; i++) {
            arr.add(sc.nextInt());
        }/*
        /*float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
            
        arr.add(num1);
        arr.add(num2);
        arr.add(num3);asdasd
         */
        int cont = 0;
        float mayor = 0;
        float menor = 0;

        Collections.sort(arr);

        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");

        float sum = 0;
        for (float x : arr) {
            sum += x;
        }

        System.out.println("Suma de todos: " + sum);
        menor = arr.get(0);
        // int ult = arr.size() - 1;
        mayor = arr.get(arr.size() - 1);
        float res3 = menor * mayor;

        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");

        float res = sum / arr.size();
        System.out.println("Promedio: " + res);

        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");

        System.out.println("Producto menor por mayor: " + res3);
        if (res3 % 3 == 0) {
            System.out.println("El resultado del producto si es divisible por 3");
        } else {
            System.out.println("El resultado del producto no es divisible por 3");
        }

        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("");

        if (arr.get(0) == arr.get(1)) {
            if (arr.get(1) == arr.get(2)) {
                System.out.println("Todos iguales");
            } else {
                System.out.println("Dos iguales");
            }
        } else if (arr.get(2) == arr.get(0)) {
            System.out.println("Dos iguales");
        } else if (arr.get(1) == arr.get(2)) {
            System.out.println("Dos iguales");
        } else {
            System.out.println("Todos distintos");
        }

        /*       
        if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("Todos los numeros son distintos");
        }else if(num1 == num2 && num2 == num3 && num1 == num3){
            System.out.println("Todos los numeros son iguales");
        }else if(num1 != num2 && num2 != num3 && num1 == num3){
            System.out.println("El numero1: " + num1 + " es igual que el numero3: " + num3);
        }else if(num1 != num2 && num2 == num3 && num1 != num3){
            System.out.println("El numero2: " + num2 + " es igual que el numero3: " + num3);
        }else if(num1 == num2 && num2 != num3 && num1 != num3){
            System.out.println("El numero1: " + num1 + " es igual que el numero2: " + num2);
        }
         */
    }

}
