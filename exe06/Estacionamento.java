package exe06;

import exe05.Tempo;

public class Estacionamento {

    private String placa;
    private String modelo;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private static final double PRECO_POR_HORA = 1.50;

    // Construtor padrão: inicializa tudo vazio/zero
    public Estacionamento() {
        this.placa = "";
        this.modelo = "";
        this.horaEntrada = new Tempo(); // 00:00:00
        this.horaSaida = new Tempo();   // 00:00:00
    }

    // Construtor com parâmetros
    public Estacionamento(String placa, String modelo, Tempo horaEntrada, Tempo horaSaida) {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    // ---- (a) Getters e Setters ----

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    // ---- (b) Inicializar dados com vazio ou zero ----
    public void inicializar() {
        this.placa = "";
        this.modelo = "";
        this.horaEntrada = new Tempo();
        this.horaSaida = new Tempo();
    }

    // ---- (c) Imprimir dados do carro estacionado ----
    public void imprimirDados() {
        System.out.println("===== Dados do Carro =====");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Hora de Entrada: " + horaEntrada);
        System.out.println("Hora de Saída: " + horaSaida);
        System.out.printf("Tempo Permanência: %.2f hora(s)%n", calcularPermanencia());
        System.out.printf("Valor a Pagar: R$ %.2f%n", calcularValorPago());
        System.out.println("==========================\n");
    }

    // ---- (d) Calcular valor a pagar ----
    public double calcularPermanencia() {
        return horaEntrada.diferencaEmHoras(horaSaida);
    }

    public double calcularValorPago() {
        return calcularPermanencia() * PRECO_POR_HORA;
    }

    @Override
    public String toString() {
        return "Estacionamento{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                '}';
    }
}