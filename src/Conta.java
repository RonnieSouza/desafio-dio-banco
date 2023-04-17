public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente para completar a transação!");
        } else {
            this.saldo -= valor;
        }

    }

    public void depositar(double valor) {
        this.saldo += valor;

    }

    public void pix(double valor, Conta contaDistino) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente para completar a transação!");
        } else {
            this.sacar(valor);
            contaDistino.depositar(valor);
        }

    }

    protected void imprimirComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


}
