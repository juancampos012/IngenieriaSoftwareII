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
public class FacturaService {
    private List<Factura> facturas = new ArrayList<>();

    public void crearFactura(Factura factura) {
        facturas.add(factura);
    }

    public Factura leerFactura(int idCliente) {
        return facturas.stream()
                .filter(f -> f.getIdCliente() == idCliente)
                .findFirst()
                .orElse(null);
    }

    public void actualizarFactura(Factura factura) {
        Factura factExistente = leerFactura(factura.getIdCliente());
        if (factExistente != null) {
            factExistente.setTotal(factura.getTotal());
            factExistente.setListaProductosIdComprados(factura.getListaProductosIdComprados());
        }
    }

    public void eliminarFactura(int idCliente) {
        facturas.removeIf(f -> f.getIdCliente() == idCliente);
    }

    public List<Factura> listarFacturas() {
        return facturas;
    }
}