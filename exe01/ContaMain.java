package exe01;

public class ContaMain {

    public static void main(String[] args) {

        // ---- Criando as duas contas ----
        ContaBancaria conta1 = new ContaBancaria(1001, "João");
        ContaBancaria conta2 = new ContaBancaria(1002, "Maria");

        // ---- Saldo inicial ----
        System.out.println(">>> Saldo inicial das contas:");
        conta1.exibirDados();
        conta2.exibirDados();

        // ---- Movimentações da Conta 1 (João) ----
        System.out.println(">>> Movimentações da Conta 1 (João):");
        conta1.depositar(1000.00);
        conta1.depositar(500.00);
        conta1.sacar(300.00);
        conta1.sacar(2000.00); // deve falhar: saldo insuficiente
        conta1.depositar(-50.00); // deve falhar: valor negativo
        conta1.sacar(-100.00);    // deve falhar: valor negativo
        System.out.println();

        // ---- Movimentações da Conta 2 (Maria) ----
        System.out.println(">>> Movimentações da Conta 2 (Maria):");
        conta2.depositar(2500.00);
        conta2.sacar(1200.00);
        conta2.depositar(300.00);
        conta2.sacar(5000.00); // deve falhar: saldo insuficiente
        System.out.println();

        // ---- Saldo final ----
        System.out.println(">>> Saldo final das contas:");
        conta1.exibirDados();
        conta2.exibirDados();

        // ---- Testando getters ----
        System.out.println(">>> Testando getters:");
        System.out.println("Conta 1 - Número: " + conta1.getNumero() + " | Titular: " + conta1.getTitular());
        System.out.printf("Conta 1 - Saldo: R$ %.2f%n", conta1.getSaldo());
        System.out.println("Conta 2 - Número: " + conta2.getNumero() + " | Titular: " + conta2.getTitular());
        System.out.printf("Conta 2 - Saldo: R$ %.2f%n", conta2.getSaldo());
    }
}