public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Rosimar");

        IConta cc = new ContaCorrente(cliente);
        IConta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);

        cc.transferir(90, poupanca);
        poupanca.sacar(15);
        cc.sacar(2);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
