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
import java.util.List;

public class FabricaPedidos {
    
    public static Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        int idPedido = generarIdUnico();
        return new Pedido(idPedido, cliente, productos);
    }

    private static int generarIdUnico() {
        return (int) (Math.random() * 1000);
    }
}
