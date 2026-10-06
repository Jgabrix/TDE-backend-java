package exe01;

public class ContaBancaria {

    // Atributos privados
    private int numero;
    private String titular;
    private double saldo;

    //Construtor vazio
    public ContaBancaria()
    {
        numero = 0;
        titular = " ";
        saldo = 0.0;
    }

    // Construtor: recebe número e titular. Saldo inicia em 0.
    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Deposita um valor na conta.
     * Aceita somente valores positivos.
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido! O valor deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.printf(" Depósito de R$ %.2f realizado com sucesso na conta de %s.%n", valor, titular);
    }

    /**
     * Saca um valor da conta.
     * Verifica se o valor é positivo e se há saldo suficiente.
     */
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido! O valor deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.printf("Saque negado! Saldo insuficiente. Saldo atual: R$ %.2f%n", saldo);
            return;
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso na conta de %s.%n", valor, titular);
    }

    /**
     * Exibe os dados da conta.
     */
    public void exibirDados() {
        System.out.println("===== Dados da Conta =====");
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("==========================\n");
    }

}