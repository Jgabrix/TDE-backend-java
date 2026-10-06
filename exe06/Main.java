package exe06;

import exe05.Tempo;

public class Main {

    public static void main(String[] args) {

        // ---- Teste 1: Construtor padrão (dados vazios/zero) ----
        System.out.println(">>> TESTE 1: Construtor padrão");
        Estacionamento e1 = new Estacionamento();
        e1.imprimirDados();

        // ---- Teste 2: Inicializar explicitamente ----
        System.out.println(">>> TESTE 2: Método inicializar()");
        e1.setPlaca("ABC-1234");
        e1.setModelo("Fiat Uno");
        e1.setHoraEntrada(new Tempo(8, 0, 0));
        e1.setHoraSaida(new Tempo(12, 0, 0));
        e1.inicializar(); // deve zerar tudo
        e1.imprimirDados();

        // ---- Teste 3: Carro estacionado por 3 horas exatas ----
        System.out.println(">>> TESTE 3: 3 horas exatas de permanência");
        Estacionamento e2 = new Estacionamento(
                "XYZ-9876",
                "Volkswagen Gol",
                new Tempo(9, 0, 0),
                new Tempo(12, 0, 0)
        );
        e2.imprimirDados();

        // ---- Teste 4: Permanência com minutos ----
        System.out.println(">>> TESTE 4: Permanência de 2h 30min");
        Estacionamento e3 = new Estacionamento(
                "DEF-4567",
                "Chevrolet Onix",
                new Tempo(14, 15, 0),
                new Tempo(16, 45, 0)
        );
        e3.imprimirDados();

        // ---- Teste 5: Permanência com segundos ----
        System.out.println(">>> TESTE 5: Permanência de 1h 30min 30s");
        Estacionamento e4 = new Estacionamento(
                "GHI-1122",
                "Toyota Corolla",
                new Tempo(7, 0, 0),
                new Tempo(8, 30, 30)
        );
        e4.imprimirDados();

        // ---- Teste 6: Testando getters ----
        System.out.println(">>> TESTE 6: Testando getters");
        System.out.println("Placa: " + e2.getPlaca());
        System.out.println("Modelo: " + e2.getModelo());
        System.out.println("Entrada: " + e2.getHoraEntrada());
        System.out.println("Saída: " + e2.getHoraSaida());

        // ---- Teste 7: Testando setters ----
        System.out.println("\n>>> TESTE 7: Testando setters");
        e2.setPlaca("XYZ-0000");
        e2.setModelo("VW Polo");
        e2.setHoraEntrada(new Tempo(10, 0, 0));
        e2.setHoraSaida(new Tempo(13, 30, 0));
        e2.imprimirDados();

        // ---- Teste 8: Verificando valor pago diretamente ----
        System.out.println(">>> TESTE 8: Valor pago calculado diretamente");
        System.out.printf("Valor a pagar (e2): R$ %.2f%n", e2.calcularValorPago());
        System.out.printf("Valor a pagar (e3): R$ %.2f%n", e3.calcularValorPago());
    }
}