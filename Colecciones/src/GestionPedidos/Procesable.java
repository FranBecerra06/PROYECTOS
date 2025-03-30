package GestionPedidos;

// Interfaz que define los métodos para preparar y entregar pedidos.
public interface Procesable {
    // Método para preparar el pedido.
    void preparar();
    // Método para entregar el pedido; retorna true si la entrega fue exitosa.
    boolean entregar();
}