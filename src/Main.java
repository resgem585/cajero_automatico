import java.util.Scanner;

public class Main {
    // Variable para almacenar el saldo del cliente Tony Stark
    static double saldo = 1599.99;

    public static void main(String[] args) {
        // Objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);

        int opcion;
        // Bucle que muestra el menú y procesa las opciones hasta que el usuario elija salir
        do {
            // Mostrar el menú al usuario
            mostrarMenu();
            // Leer la opción seleccionada por el usuario
            opcion = scanner.nextInt();

            // Procesar la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirar(scanner);
                    break;
                case 3:
                    depositar(scanner);
                    break;
                case 9:
                    // Salir del programa
                    System.out.println("Finalizando el programa. ¡Muchas gracias por usar nuestros servicios!");
                    break;
                default:
                    // Mensaje de error para opciones no válidas
                    System.out.println("Opción inválida. Por favor, elija una opción válida del menú.");
            }
        } while (opcion != 9); // Continuar mostrando el menú hasta que el usuario elija salir

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para mostrar el menú de opciones
    public static void mostrarMenu() {
        System.out.println("---- Menú ----");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar");
        System.out.println("3. Depositar");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Método para consultar el saldo actual
    public static void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    // Método para realizar una operación de retiro
    public static void retirar(Scanner scanner) {
        System.out.print("Ingrese el monto a retirar: ");
        double monto = scanner.nextDouble();

        // Verificar si el saldo es suficiente para el retiro
        if (monto <= saldo) {
            saldo -= monto; // Actualizar el saldo después del retiro
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            // Mensaje de saldo insuficiente si el retiro excede el saldo disponible
            System.out.println("Saldo insuficiente. No se puede realizar el retiro.");
        }
    }

    // Método para realizar una operación de depósito
    public static void depositar(Scanner scanner) {
        System.out.print("Ingrese el monto a depositar: ");
        double monto = scanner.nextDouble();

        // Realizar el depósito y actualizar el saldo
        saldo += monto;
        System.out.println("Depósito exitoso. Saldo actualizado: " + saldo);
    }
}
