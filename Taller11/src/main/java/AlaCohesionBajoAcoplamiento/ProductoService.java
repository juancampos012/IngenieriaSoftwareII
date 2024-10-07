/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlaCohesionBajoAcoplamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juancamposbetancourth
 */
public class ProductoService {
    private List<Producto> productos = new ArrayList<>();

    public void crearProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto leerProducto(int id) {
        return productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void actualizarProducto(Producto producto) {
        Producto prodExistente = leerProducto(producto.getId());
        if (prodExistente != null) {
            prodExistente.setNombre(producto.getNombre());
            prodExistente.setPrecio(producto.getPrecio());
        }
    }

    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    public List<Producto> listarProductos() {
        return productos;
    }
}