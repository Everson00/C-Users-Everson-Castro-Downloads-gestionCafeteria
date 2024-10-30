
package com.mycompany.gestioncafeteria;

import java.util.LinkedList;


public class Pedido {
    
    private String nombreCliente;
    private LinkedList<Producto> productos;

    public Pedido(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.productos = new LinkedList<>();
    }

    public void agregarProducto(String nombreProducto, int cantidad) {
        productos.add(new Producto(nombreProducto, cantidad));
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void mostrearEstadofila() {
        System.out.println("\nClientes en espera: ");
        StringBuilder detallePedido = new StringBuilder("Cliente: " + nombreCliente + "\nProductos:\n");
        for (Producto producto : productos) {
            detallePedido.append(" - ").append(producto).append("\n");
        }
    }
}
