package ort.edu.ar.matias.rosenstein.ej2y3;

import java.util.ArrayList;
import java.util.Arrays;

public class Carrera {

    private String nombre;
    private ArrayList<Atleta> atletas;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.atletas = new ArrayList<>();
    }

    public void agregarAtleta(Atleta atleta){
        if (!this.atletas.contains(atleta)) this.atletas.add(atleta);
    }

    public ArrayList<Atleta> obtenerGanador(){
        ArrayList<Atleta> ganadores = new ArrayList<>();
        double mejorTiempo = Double.MAX_VALUE;

        for (Atleta atleta : this.atletas){
            double segundosAux = atleta.getSegundosEmpleados();
            if (segundosAux <= mejorTiempo){
                if (segundosAux < mejorTiempo) ganadores.clear();
                ganadores.add(atleta);
                mejorTiempo = segundosAux;
            }
        }

        return ganadores;
    }

    public ArrayList<Atleta> obtenerTernaGanadora(){
        ArrayList<Atleta> listaAux = new ArrayList<>();
        listaAux.addAll(this.atletas);
        ArrayList<Atleta> ganadores = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            ganadores.addAll(obtenerGanador());
            atletas.removeAll(obtenerGanador());
        }

        this.atletas = listaAux;

        return ganadores;
    }
}
