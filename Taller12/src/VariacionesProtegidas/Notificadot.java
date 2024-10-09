/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VariacionesProtegidas;

/**
 *
 * @author juancamposbetancourth
 */
public class Notificadot {
    private CanalNotificacion canal;

    public Notificadot(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void setCanal(CanalNotificacion canal) {
        this.canal = canal;
    }

    public void enviarNotificacion(Notificacion notificacion) {
        canal.enviar(notificacion);
    }
}
