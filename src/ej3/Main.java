
package ej3;


import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero: ");
        int numero = sc.nextInt();
        while(!(numero >=0)){
            System.out.println("Escriba un numero entero positivo");
            numero = sc.nextInt();
        }
        
            float factorial = 1;
            while ( numero!=0) {
                factorial=factorial*numero; numero--;
            }
            System.out.println("Resultado: "+factorial);
        
    }
}
