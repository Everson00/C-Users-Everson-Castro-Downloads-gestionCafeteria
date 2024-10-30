

package com.mycompany.gestioncafeteria;


import java.util.Scanner;

public class GestionCafeteria {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;

        // menu de opciones
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Atender el siguiente pedido");
            System.out.println("3. Ver estado de pedidos pendientes");
            System.out.println("4. Salir");

            int opcion = leer.nextInt();
            leer.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = leer.nextLine();
                    Pedido nuevoPedido = new Pedido(nombreCliente);

                    boolean agregarProductos = true;
                    while (agregarProductos) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombreProducto = leer.nextLine();
                        System.out.print("Ingrese la cantidad de " + nombreProducto + ": ");
                        int cantidad = leer.nextInt();
                        leer.nextLine(); // Limpiar el buffer

                        nuevoPedido.agregarProducto(nombreProducto, cantidad);

                        System.out.print("¿Desea agregar otro producto al pedido? (s/n): ");
                        String respuesta = leer.nextLine();
                        agregarProductos = respuesta.equalsIgnoreCase("s");
                    }

                    cafeteria.registrarPedido(nuevoPedido);
                    break;

                case 2:
                    cafeteria.atenderPedido();
                    break;

                case 3:
                    cafeteria.mostrarPedidosPendientes();
                    break;

                case 4:
                    continuar = false;
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción no válida, por favor intente de nuevo.");
                    break;
            }
        }

        leer.close();
    }
}
