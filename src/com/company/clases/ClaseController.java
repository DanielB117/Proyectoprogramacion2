package com.company.clases;

import com.company.lector.LectorDeTeclado;

public class ClaseController {
    LectorDeTeclado LDT = new LectorDeTeclado();
    int opcion;
    private ClaseView cv;
    private ClaseModel cm;


    public ClaseController(){
        cv = new ClaseView();
        cm= new ClaseModel();
    }

    public void presentarListaClases(){
        cv.verLista(cm.getClase());
    }


    public int Leeropcion() {
        opcion = LDT.getInteger( "Ingrese una opcion","Ha cometido un error, Intente de nuevo");
        return opcion;
    }

    public int ObtenerResultado(int opcion){
        switch (opcion){
            case 1:{
                presentarListaClases();
            }
            break;
            case 2:{
                String clase = obtenerClase();
                String horario = obtenerHorario();
                cm.createClase(clase,horario);
                System.out.println("Se agrego una clase.");

            }
            break;
            case 3:{
                cv.pedirposicion();
                int posicion = obtenerPosicicon();
                cv.pedirhorario();
                String horario = obtenerHorario();
                cv.pedirclase();
                String clase = obtenerClase();
                cm.updateClase(posicion,clase,horario);
                System.out.println("Se ha modifico una clase.");
            }
            break;
            case 4 :{
               cv.pedirposicion();
               int posicion = obtenerPosicicon();
               cm.readClase(posicion);
            }
            break;
            case 5:{
             cm.agregarAlumnoClase();
            }
            break;
            case 6:{
             cm.asignarMaestro();
            }
            break;
            case 7:{
                int posicion = obtenerPosicicon();
                cm.deleteClase(posicion);
                System.out.println("Se elimino una la clase");
            }
            default:
            {

            }
        }
        return opcion;
    }
    private String obtenerClase() {
        return LDT.getString("Intentelo de nuevo");
    }
    private String obtenerHorario(){
        return LDT.getString( "Intentelo de nuevo");
    }
    private int obtenerPosicicon(){
        return LDT.getInteger("Intentelo de nuevo");
    }
}
