/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraPregunta;

/**
 *
 * @author juancamposbetancourth
 */
public class OrdenEstado {

    public OrdenEstado() {
    }
    
    public String obtenerEstado(int ordenId){
        if(ordenId < 0){
            return "Orden invalida";
        }else{
            if(ordenId > 100){
                return "Completada";
            }else if(ordenId >50){
                return "En progreso";
            }else if(ordenId == 0 || ordenId <=50){
                return "Pendiente";
            }
        }
        return null;
    }    
}
