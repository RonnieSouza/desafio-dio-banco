public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void pix(double valor, Conta contaDestino);

    void imprimirExtrato();
}
