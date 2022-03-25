
package ej2;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un año: ");
        int año = sc.nextInt();
        while(!(año>1900 && año<2500)){
            System.out.println("Año incorrecto, ingresarlo de nuevo");
            año = sc.nextInt();
        }
        
        if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)){
	System.out.println("El año es bisiesto");}
        else{
	System.out.println("El año no es bisiesto");}
        
    
    }
}
