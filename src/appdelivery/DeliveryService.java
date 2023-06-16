
package appdelivery;

import java.util.ArrayList;
import java.util.List;

class DeliveryService {
    private final List<Pedido> pedidosEnEspera;
    
    public DeliveryService() {
        pedidosEnEspera = new ArrayList<>();
    }
    
    public void agregarPedido(Pedido pedido) {
        pedidosEnEspera.add(pedido);
    }
    
    public void mostrarPedidosEnEspera() {
        pedidosEnEspera.stream().map((pedido) -> {
            System.out.println("Pedido: ");
            return pedido;
        }).map((pedido) -> {
            for (Producto producto : pedido.getProductos()) {
                System.out.println("- " + producto.getNombre() + " - Precio: " + producto.getPrecio());
            }
            return pedido;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }
    
    
}