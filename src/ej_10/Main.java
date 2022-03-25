
package ej_10;

import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Dylan","Sanchez",30,700);
        Empleado empleado2 = new Empleado("Ezequiel","Ruzzotti",45,700);
        Empleado empleado3 = new Empleado("Juan","Lugones",20,700);
        Empleado empleado4 = new Empleado("Joaquin","Almerti",40,700);
        Empleado empleado5 = new Empleado("Gabriel","Casar",30,700);

        ArrayList<Empleado> arr = new ArrayList();


        arr.add(empleado1);
        arr.add(empleado2);
        arr.add(empleado3);
        arr.add(empleado4);
        arr.add(empleado5);

        double res;

        for (int i = 0; i < 5; i++) {
            if(arr.get(i).getNumero_horas()<=40){
                res = arr.get(i).getNumero_horas() * arr.get(i).getTarifa__por_horas();
                System.out.println("Sueldo bruto de "+arr.get(i).getNombre() + " " +arr.get(i).getApellido() + ": " + res);
            }else{
                res = arr.get(i).getNumero_horas() * arr.get(i).getTarifa__por_horas() * 1.5;
                System.out.println("Sueldo bruto de "+arr.get(i).getNombre() + " " +arr.get(i).getApellido() + ": " + res);
            }
        }

        
    }
    
}
