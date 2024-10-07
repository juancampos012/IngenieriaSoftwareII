/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricacionPura;

/**
 *
 * @author juancamposbetancourth
 */
import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.fecha = new Date(); 
        this.cliente = cliente;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotalProducto();
        }
        return total;
    }
}
