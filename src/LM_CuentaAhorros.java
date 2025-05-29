public class LM_CuentaAhorros extends LM_Cuenta {
    private boolean activa;

    public LM_CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = saldo > 0;
    }

    public void depositar(float cantidad) {
        super.depositar(cantidad);
        if (saldo > 0) {
            activa = true;
        }
    }

    public void retirar(float cantidad) {
        if (!activa) {
            System.out.println("La cuenta está inactiva. No se puede retirar.");
        } else if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            super.retirar(cantidad);
            if (saldo <= 0) {
                activa = false;
            }
        }
    }


    public void imprimir() {
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Depósitos realizados: " + numeroDepositos);
        System.out.println("Retiros realizados: " + numeroRetiros);
        System.out.println("Tasa de interés anual: " + (tasaAnual * 100) + "%");
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
}

