
package ej_11;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        long numero = 0;
        long aux, digito; 
        long decimal = 0;
        int exponente = 0;
        boolean esBinario = false;

        Scanner sc = new Scanner(System.in);

        while (!esBinario) {
              System.out.print("Introduce un numero binario: ");
              numero = sc.nextLong();
              esBinario = true;
              aux = numero;

              while (aux != 0) {
                         digito = aux % 10;
                         if (digito != 0 && digito != 1) { 
                              esBinario = false;
                         }
                         aux = aux / 10;                        
               }
          } 

          while (numero != 0) {
                    digito = numero % 10;                        
                    decimal = decimal + digito * (int) Math.pow(2, exponente);
                    exponente++;
                    numero = numero / 10;
          }
          System.out.println("Decimal: " + decimal);


    }
    
}
