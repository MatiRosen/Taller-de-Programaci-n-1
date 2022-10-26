package ort.edu.ar.matias.rosenstein.ej1;

import java.util.ArrayList;

public class Grupo {

    private final static String MSG_INTEGRANTE_AGREGADO = "%s fue asignado al grupo %s";

    private String nombre;
    private ArrayList<String> integrantes;

    public Grupo(String nombre) {
        this.setNombre(nombre);
        this.integrantes = new ArrayList<>();
    }

    public void agregarIntegrante(String nombreIntegrante){
        if (!integrantes.contains(nombreIntegrante)){
            integrantes.add(nombreIntegrante);
            System.out.printf(MSG_INTEGRANTE_AGREGADO, nombreIntegrante, getNombre());
            System.out.println();
        }
    }

    private int obtenerPosicionIntegrante(String nombreIntegrante){
        int pos = -1;
        int i = 0;
        while (i < getCantidadIntegrantes() && pos == -1){
            if (integrantes.get(i).equals(nombreIntegrante)){
                pos = i;
            }
            i++;
        }

        return pos;
    }

    public String obtenerIntegrante(int posicion){
        return this.integrantes.get(posicion - 1);
    }

    public String buscarIntegrante(String nombre){
        int pos = this.obtenerPosicionIntegrante(nombre);
        return pos == -1 ? null : this.integrantes.get(obtenerPosicionIntegrante(nombre));
    }

    public String removerIntegrante(String nombreIntegrante){
        return this.integrantes.remove(nombreIntegrante) ? nombreIntegrante : null;
    }

    private void mostrarIntegrantes(){
        System.out.println("Cantidad de integrantes: " + getCantidadIntegrantes());
        if (getCantidadIntegrantes() > 0){
            System.out.println("Nombres:");
            for (String integrante : this.integrantes){
                System.out.println("- " + integrante);
            }
        }
    }

    public void mostrar(){
        System.out.println("Nombre del grupo: " + this.nombre);
        mostrarIntegrantes();
    }

    public void vaciar(){
        this.integrantes.clear();
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadIntegrantes(){
        return integrantes.size();
    }
}
