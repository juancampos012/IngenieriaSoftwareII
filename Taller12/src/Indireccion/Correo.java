/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Indireccion;

/**
 *
 * @author juancamposbetancourth
 */
public class Correo {
    private String destinatario;
    private String cuerpo;
    private String proveedor;

    public Correo(String destinatario, String cuerpo, String proveedor) {
        this.destinatario = destinatario;
        this.cuerpo = cuerpo;
        this.proveedor = proveedor;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void mostrarCorreo() {
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Cuerpo del mensaje: " + cuerpo);
        System.out.println("Proveedor: " + proveedor);
    }
}
