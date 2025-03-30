package GestionPedidos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicio del sistema de gestión de pedidos
        System.out.println("=== Sistema de Gestión de Pedidos ===");
        
        // Se crea la instancia de Restaurante
        Restaurante restaurante = new Restaurante();
        
        // Se crean varios pedidos y se registran en el restaurante
        Pedido pedido1 = new Pedido(1, "Juan");
        Pedido pedido2 = new Pedido(2, "Ana");
        Pedido pedido3 = new Pedido(3, "Carlos");
        Pedido pedido4 = new Pedido(4, "Sofía");
        Pedido pedido5 = new Pedido(5, "Luis");
        Pedido pedido6 = new Pedido(6, "Ana");
        
        restaurante.registrarPedido(pedido1);
        restaurante.registrarPedido(pedido2);
        restaurante.registrarPedido(pedido3);
        restaurante.registrarPedido(pedido4);
        restaurante.registrarPedido(pedido5);
        restaurante.registrarPedido(pedido6);
        
        // Se prepara y entrega algunos pedidos
        pedido1.preparar();
        pedido1.entregar();
        pedido2.preparar();
        // pedido3 se deja sin preparar para comprobar el conteo de pendientes
        pedido4.preparar();
        pedido4.entregar();
        pedido6.preparar();
        
        // Se muestran los 5 pedidos más recientes
        System.out.println("\nLos 5 pedidos más recientes:");
        List<Pedido> recientes = restaurante.mostrarPedidosRecientes();
        for (Pedido p : recientes) {
            System.out.println("Pedido #" + p.getNumeroPedido() + " de " + p.getCliente()
                    + " - Fecha: " + p.getFechaPedido() 
                    + " - Preparado: " + p.isPreparado() 
                    + " - Entregado: " + p.isEntregado());
        }
        
        // Se cuentan los pedidos pendientes de entrega
        long pendientes = restaurante.contarPendientesEntrega();
        System.out.println("\nPedidos pendientes de entrega: " + pendientes);
        
        // Se filtran los pedidos realizados por el cliente "Ana"
        System.out.println("\nPedidos realizados por Ana:");
        List<Pedido> pedidosAna = restaurante.filtrarPorCliente("Ana");
        for (Pedido p : pedidosAna) {
            System.out.println("Pedido #" + p.getNumeroPedido());
        }
    }
}