
package ej8;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("cuantos numeros quiere ingresar: ");

        int num=sc.nextInt();



        while(!(num > 0)){
                            System.out.println("Escriba un numero mayor a 0");
                            System.out.print("cuantos numeros quiere ingresar: ");
                            num = sc.nextInt();
                        }


        int val,mayor,menor;
        float res;

        mayor=0;
        menor=1000000000;
        res=0;

        for (int i=1;i<=num;i++) {
            System.out.println("Ingrese numero" + i+": ");
            val=sc.nextInt();

            if (val>mayor){

                mayor=val;

            }
            if (val<menor) {

                menor=val;

            }

            //res=res+val;

        }

        

        System.out.println("El numero mayor es: "+mayor+"\n");

        System.out.println("El numero menor es: "+menor+"\n");

        for (int i = menor+1; i < mayor; i++) {
                    
                        res = res + i;
                        //System.out.println(res);
                    

                }

        System.out.println("Suma: "+res);

    
    }
    
}
