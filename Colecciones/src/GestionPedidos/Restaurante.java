package GestionPedidos;

import java.util.*;
import java.util.stream.Collectors;

// Clase que gestiona los pedidos realizados en el restaurante.
public class Restaurante {
    // Lista para almacenar los pedidos.
    private List<Pedido> pedidos;

    // Constructor que inicializa la lista de pedidos.
    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    // Registra un nuevo pedido agregándolo a la lista.
    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    // Retorna los 5 pedidos más recientes ordenados de la fecha más nueva a la más antigua.
    public List<Pedido> mostrarPedidosRecientes() {
        return pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getFechaPedido).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    // Cuenta cuántos pedidos aún no han sido entregados.
    public long contarPendientesEntrega() {
        return pedidos.stream()
                .filter(p -> !p.isEntregado())
                .count();
    }

    // Filtra y retorna los pedidos realizados por un cliente en específico.
    public List<Pedido> filtrarPorCliente(String cliente) {
        return pedidos.stream()
                .filter(p -> p.getCliente().equalsIgnoreCase(cliente))
                .collect(Collectors.toList());
    }
}