package appdelivery;
       
public class SistemaDelivery {
    public static void main(String[] args) {
        // Crear una instancia de la clase DeliveryService
        DeliveryService deliveryService = new DeliveryService();
        
        // Crear algunos productos
        Producto producto1 = new Producto("Pizza", 10.99);
        Producto producto2 = new Producto("Hamburguesa", 8.99);
        
        // Crear un pedido
        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        
        // Agregar el pedido al servicio de delivery
        deliveryService.agregarPedido(pedido1);
        
        // Mostrar los pedidos en espera
        deliveryService.mostrarPedidosEnEspera();
    }
}
