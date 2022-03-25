
package ej_10;


public class Empleado {
    private String nombre;
    private String apellido;
    private int numero_horas;
    private int tarifa__por_horas;

    public Empleado(String nombre, String apellido, int numero_horas, int tarifa__por_horas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_horas = numero_horas;
        this.tarifa__por_horas = tarifa__por_horas;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_horas() {
        return numero_horas;
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public int getTarifa__por_horas() {
        return tarifa__por_horas;
    }

    public void setTarifa__por_horas(int tarifa__por_horas) {
        this.tarifa__por_horas = tarifa__por_horas;
    }


}
