
package com.mycompany.gestioncafeteria;

import java.util.LinkedList;
import java.util.Queue;


public class Cafeteria {
    
    private Queue<Pedido> pedidos;

        public Cafeteria() {
            pedidos = new LinkedList<>();
        }

        public void registrarPedido(Pedido pedido) {
            pedidos.add(pedido);
            System.out.println("Pedido registrado para: " + pedido.getNombreCliente());
        }

        public void atenderPedido() {
            if (pedidos.isEmpty()) {
                System.out.println("No hay pedidos pendientes.");
            } else {
                Pedido pedido = pedidos.poll();
                System.out.println("Atendiendo pedido:\n" + pedido);
            }
        }

        public void mostrarPedidosPendientes() {
            if (pedidos.isEmpty()) {
                System.out.println("No hay pedidos pendientes.");
            } else {
                System.out.println("Pedidos pendientes:");
                for (Pedido pedido : pedidos) {
                    System.out.println(pedido);
                }
            }
        }
}


