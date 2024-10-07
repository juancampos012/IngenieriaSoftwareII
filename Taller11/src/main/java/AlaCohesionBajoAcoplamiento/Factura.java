/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlaCohesionBajoAcoplamiento;

import java.util.Date;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
import java.util.List;
import java.util.Date;

public class Factura {
    private List<Integer> idProducto;
    private List<String> nombreProducto;
    private List<Double> precioProducto;
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private List<Integer> listaProductosIdComprados;
    private double descuento;
    private double total;
    private Date fechaFactura;

    private CalculadorDescuento calculadorDescuento;

    public Factura(CalculadorDescuento calculadorDescuento) {
        this.calculadorDescuento = calculadorDescuento;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Integer> getListaProductosIdComprados() {
        return listaProductosIdComprados;
    }

    public void setListaProductosIdComprados(List<Integer> listaProductosIdComprados) {
        this.listaProductosIdComprados = listaProductosIdComprados;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void calcularTotal() {
        total = 0;
        for (double precio : precioProducto) {
            total += precio;
        }
        total = calculadorDescuento.aplicarDescuento(total, descuento);
    }

    public String generarNumeroFactura() {
        return java.util.UUID.randomUUID().toString();
    }

    public void procesarFactura(Cliente cliente, List<Producto> productos) {
        this.idCliente = cliente.getId();
        this.nombreCliente = cliente.getNombre();
        this.direccionCliente = cliente.getDireccion();

        this.idProducto = productos.stream().map(Producto::getId).toList();
        this.nombreProducto = productos.stream().map(Producto::getNombre).toList();
        this.precioProducto = productos.stream().map(Producto::getPrecio).toList();

        calcularTotal();
    }
}
