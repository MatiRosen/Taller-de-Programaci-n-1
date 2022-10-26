package ort.edu.ar.matias.rosenstein.ej1;

public class Test {

    public static void main(String[] args) {
        Grupo grupo = new Grupo("15");
        grupo.agregarIntegrante("Matias Rosenstein");

        // Agrego el ficticio... (Si, soy el unico integrante del grupo ;( )
        grupo.agregarIntegrante("Lionel Messi");

        System.out.println(fueAgregado(grupo, "Matias Rosenstein"));
        System.out.println(fueAgregado(grupo, "Homero Simpson"));

        grupo.mostrar();
        System.out.println(grupo.removerIntegrante("Lionel Messi"));
        System.out.println(grupo.removerIntegrante("Lionel Messi"));

        grupo.mostrar();
        grupo.vaciar();
        grupo.mostrar();

    }

    public static boolean fueAgregado(Grupo grupo, String nombre){
        return grupo.buscarIntegrante(nombre) != null;
    }
}
