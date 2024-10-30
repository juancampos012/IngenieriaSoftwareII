/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaPregunta;

/**
 *
 * @author juancamposbetancourth
 */
public class ServicioTareas {
    Tarea tarea;

    public ServicioTareas(Tarea tarea) {
        this.tarea = tarea;
    }
    
    public void insertarTarea(Tarea thisTarea){
        System.out.println("Insertando la tarea");
    }
    
    public void leerTarea(){
        System.out.println("leyendo la tarea");
    }
}
