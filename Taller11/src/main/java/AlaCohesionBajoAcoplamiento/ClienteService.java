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
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public void crearCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente leerCliente(int id) {
        return clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void actualizarCliente(Cliente cliente) {
        Cliente cliExistente = leerCliente(cliente.getId());
        if (cliExistente != null) {
            cliExistente.setNombre(cliente.getNombre());
            cliExistente.setDireccion(cliente.getDireccion());
        }
    }

    public void eliminarCliente(int id) {
        clientes.removeIf(c -> c.getId() == id);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}