package GestionPedidos;

import java.time.LocalDateTime;

// Clase que representa un pedido en el restaurante y que implementa la interfaz Procesable.
public class Pedido implements Procesable {
    // Número identificador del pedido.
    private int numeroPedido;
    // Nombre del cliente que realiza el pedido.
    private String cliente;
    // Fecha y hora en que se realizó el pedido.
    private LocalDateTime fechaPedido;
    // Indica si el pedido está preparado.
    private boolean preparado;
    // Indica si el pedido ya fue entregado.
    private boolean entregado;

    // Constructor que inicializa el pedido con la fecha actual y estados en false.
    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.fechaPedido = LocalDateTime.now();
        this.preparado = false;
        this.entregado = false;
    }

    // Cambia el estado a preparado.
    @Override
    public void preparar() {
        this.preparado = true;
    }

    // El pedido solo se entrega si está preparado; si no, lanza una excepción.
    @Override
    public boolean entregar() {
        if (!preparado) {
            throw new IllegalStateException("El pedido debe estar preparado antes de ser entregado.");
        }
        this.entregado = true;
        return true;
    }

    // Métodos para obtener los atributos.
    public int getNumeroPedido() { return numeroPedido; }
    public String getCliente() { return cliente; }
    public LocalDateTime getFechaPedido() { return fechaPedido; }
    public boolean isPreparado() { return preparado; }
    public boolean isEntregado() { return entregado; }
}