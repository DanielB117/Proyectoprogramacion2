package com.company.maestros;

import java.util.ArrayList;

public class MaestrosView {
    public void MenuMaestros(){
        System.out.println("\tMenu Maestros");
        System.out.println("1. Ver lista de maestros");
        System.out.println("2. Agregar un maestro");
        System.out.println("3. Modificar la informcion de un maestro");
        System.out.println("4. Leer un maestro");
        System.out.println("5. Eliminar un maestro");
    }

    void verLista (ArrayList<Maestros> maestros){
        System.out.println("\t\tMaestro:");
        System.out.println("#,\tcargo, \tnombre");
        int i = 1;
        for (Maestros maestro : maestros) {
            System.out.println("" + (i++) + "\t" + maestro);
        }
    }
    public void pedirnombre(){
        System.out.println("Ingrese su nombre");
    }
    public void pedircargo(){ System.out.println("Ingrese su cargo"); }
    public void pedirposicion(){
        System.out.println("Ingrese su posicion");
    }
}
