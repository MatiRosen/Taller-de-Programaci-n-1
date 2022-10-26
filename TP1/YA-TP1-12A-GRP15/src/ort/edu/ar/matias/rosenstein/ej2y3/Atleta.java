package ort.edu.ar.matias.rosenstein.ej2y3;

public class Atleta {

    private double segundosEmpleados;
    private String nombre;


    public Atleta(String nombre, double segundosEmpleados) {
        this.setSegundosEmpleados(segundosEmpleados);
        this.setNombre(nombre);
    }

    public double getSegundosEmpleados() {
        return segundosEmpleados;
    }

    private void setSegundosEmpleados(double segundosEmpleados) {
        this.segundosEmpleados = segundosEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
