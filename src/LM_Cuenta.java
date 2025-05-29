public class LM_Cuenta {
    protected float saldo;
    protected int numeroDepositos;
    protected int numeroRetiros;
    protected float tasaAnual;

    public LM_Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.numeroDepositos = 0;
        this.numeroRetiros = 0;
    }

    public void depositar(float cantidad) {
        saldo += cantidad;
        numeroDepositos++;
    }

    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para retirar esa cantidad.");
        } else {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroDepositos() {
        return numeroDepositos;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }
}
