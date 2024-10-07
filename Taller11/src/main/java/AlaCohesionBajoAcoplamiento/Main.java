/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlaCohesionBajoAcoplamiento;

/**
 *
 * @author juancamposbetancourth
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductoService productoService = new ProductoService();
        ClienteService clienteService = new ClienteService();
        FacturaService facturaService = new FacturaService();
        
        Producto producto1 = new Producto();
        producto1.setId(1);
        producto1.setNombre("Laptop");
        producto1.setPrecio(1000.0);

        Producto producto2 = new Producto();
        producto2.setId(2);
        producto2.setNombre("Mouse");
        producto2.setPrecio(50.0);

        productoService.crearProducto(producto1);
        productoService.crearProducto(producto2);
        
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Juan Pérez");
        cliente.setDireccion("Calle 123");
        clienteService.crearCliente(cliente);

        CalculadorDescuento calculadorDescuento = new CalculadorDescuentoSimple();
        Factura factura = new Factura(calculadorDescuento);

        List<Producto> productosComprados = new ArrayList<>();
        productosComprados.add(producto1);
        productosComprados.add(producto2);

        factura.procesarFactura(cliente, productosComprados);
        factura.setDescuento(10.0); 
        facturaService.crearFactura(factura);
        
        System.out.println("Factura creada:");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total sin descuento: 1050.0");
        System.out.println("Total con descuento: " + factura.getTotal());

        Factura facturaLeida = facturaService.leerFactura(cliente.getId());
        if (facturaLeida != null) {
            System.out.println("Factura leída. Total: " + facturaLeida.getTotal());
        }

        facturaLeida.setDescuento(20.0);
        facturaLeida.calcularTotal(); 
        facturaService.actualizarFactura(facturaLeida);

        System.out.println("Factura actualizada. Total con 20% de descuento: " + facturaLeida.getTotal());

        productoService.eliminarProducto(producto2.getId());
        System.out.println("Producto eliminado. Productos restantes: " + productoService.listarProductos().size());

        facturaService.eliminarFactura(cliente.getId());
        System.out.println("Factura eliminada. Facturas restantes: " + facturaService.listarFacturas().size());
    }
}
