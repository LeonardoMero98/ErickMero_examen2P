import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LM_CuentaAhorros cuenta = new LM_CuentaAhorros(500, 0.05f);

        System.out.println("Tasa de Interés Anual: " + (cuenta.getTasaAnual() * 100) + "%");

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Cantidad a depositar: ");
                float monto = scanner.nextFloat();
                cuenta.depositar(monto);
                System.out.println("Saldo: $" + cuenta.getSaldo());
                System.out.println("Depósitos realizados: " + cuenta.getNumeroDepositos());
            } else if (opcion == 2) {
                System.out.print("Cantidad a retirar: ");
                float monto = scanner.nextFloat();
                cuenta.retirar(monto);
                System.out.println("Saldo: $" + cuenta.getSaldo());
                System.out.println("Retiros realizados: " + cuenta.getNumeroRetiros());
            } else if (opcion == 3) {
                cuenta.imprimir();
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
