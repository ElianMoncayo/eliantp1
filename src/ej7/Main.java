
package ej7;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        int numero_correcto = 166;
        Scanner sc = new Scanner(System.in);
        System.out.println("=====ADIVINA EL NUMERO====");
        System.out.println("Ingresar un numero: ");
        

        int num = sc.nextInt();

        while(num != numero_correcto){
                if(num<numero_correcto){
                            System.out.println("El numero es mayor");
                            System.out.print("Prueba con otro numero: ");                          
                            num = sc.nextInt();
                        }else{
                            System.out.println("El numero es menor");
                            System.out.print("Prueba con otro numero: ");                          
                            num = sc.nextInt();
                        }
         }
        System.out.println("Correcto!");
    }
    
}
