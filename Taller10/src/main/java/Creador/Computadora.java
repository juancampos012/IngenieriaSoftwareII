/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

/**
 *
 * @author juancamposbetancourth
 */
public class Computadora {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;


    private Computadora() {}

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public static Computadora crearComputadora(String procesador, String tarjetaGrafica, int ram) {
        Computadora computadora = new Computadora();
        computadora.setProcesador(procesador);
        computadora.setTarjetaGrafica(tarjetaGrafica);
        computadora.setRam(ram);
        return computadora;
    }
}

