import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creación de una orden
        Orden orden = new Orden();

        // Pedir la cantidad de productos a agregar
        System.out.print("Ingrese la cantidad de productos a agregar: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine();

        // Pedir los detalles de cada producto y agregarlos a la orden
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.println("Producto #" + i);
            System.out.print("Ingrese el ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese la marca (solo para productos electrónicos): ");
            String marca = scanner.nextLine();

            // Crear el producto correspondiente (Producto o Electronico) según si se ingresa la marca o no
            Producto producto;
            if (marca.isEmpty()) {
                producto = new Producto(id, nombre, precio, cantidad);
            } else {
                producto = new Electronico(id, nombre, precio, cantidad, marca);
            }

            // Agregar el producto a la orden
            orden.agregarProducto(producto);

            System.out.println("------------------------");
        }

        // Calcular total y mostrar detalles de la orden
        System.out.println("Detalles de la orden:");
        orden.mostrarDetalles();

        scanner.close();
    }

    }
