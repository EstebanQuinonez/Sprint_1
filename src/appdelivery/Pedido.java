
package appdelivery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban QR
 */
class Pedido {
    private final List<Producto> productos;
    
    public Pedido() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    Iterable<Producto> getProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
