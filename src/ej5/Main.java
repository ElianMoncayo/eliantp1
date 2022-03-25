
package ej5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero del 1 al 10: ");
        int num = sc.nextInt();
        float res;
 
        while(!(num > 0 && num < 10)){
                    System.out.println("Escriba un numero mayor a 0 y menor que 10");
                    num = sc.nextInt();
                }
  

        for (int i = 1; i <= 10; i++) {
            res = num*i;          
            System.out.println(num + " * " + i + " = " + res);
            
        }
}
    
    
}

