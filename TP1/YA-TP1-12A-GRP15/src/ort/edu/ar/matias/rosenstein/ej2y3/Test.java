package ort.edu.ar.matias.rosenstein.ej2y3;

public class Test {

    public static void main(String[] args) {
        Carrera carrera = new Carrera("Olimpica");

        carrera.agregarAtleta(new Atleta("Matias Rosenstein", 35.4));
        carrera.agregarAtleta(new Atleta("Lionel Messi", 27.1));
        carrera.agregarAtleta(new Atleta("Homero Simpson", 55.2));
        carrera.agregarAtleta(new Atleta("Steven Tyler", 27.3));
        carrera.agregarAtleta(new Atleta("Adam Smith", 39.9));
        carrera.agregarAtleta(new Atleta("George Lucas", 27.3));
        carrera.agregarAtleta(new Atleta("Adam Sandler", 27.3));
        carrera.agregarAtleta(new Atleta("Kun Aguero", 35.4));

        for (Atleta atleta : carrera.obtenerGanador()){
            System.out.println(atleta.getNombre());
        }

        System.out.println("--------------");

        for (Atleta atleta: carrera.obtenerTernaGanadora()){
            System.out.println(atleta.getNombre());
        }

        System.out.println("-------------");

        for (Atleta atleta : carrera.obtenerGanador()){
            System.out.println(atleta.getNombre());
        }

    }
}
