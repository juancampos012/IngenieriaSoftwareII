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
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "Calle Falsa 123");

        Producto producto1 = new Producto("Laptop", 1200.00, 1);
        Producto producto2 = new Producto("Mouse", 25.00, 2);

        List<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);

        Pedido pedido = FabricaPedidos.crearPedido(cliente, productos);

        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Fecha del Pedido: " + pedido.getFecha());
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Dirección: " + pedido.getCliente().getDireccion());
        System.out.println("Productos:");

        for (Producto producto : pedido.getProductos()) {
            System.out.println(" - " + producto.getNombre() + ": $" + producto.getPrecio() + " x " + producto.getCantidad());
        }

        System.out.println("Total del pedido: $" + pedido.calcularTotalPedido());
    }
}
