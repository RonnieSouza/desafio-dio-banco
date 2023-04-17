public class Main {
    public static void main(String[] args) {
        Cliente ronnie = new Cliente();
        ronnie.setNome("Ronnie Vicente de Souza");

        Conta conta1 = new ContaCorrente(ronnie);
        Conta conta2 = new ContaPoupanca(ronnie);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();

    }
}
