package exe09;

public class Teste {
    static void status(Quarto q) {
        System.out.printf("Quarto %d (%s) - R$ %.2f/noite - %s%n",
                q.getNumero(), q.getTipo(), q.getPrecoPorNoite(),
                q.isOcupado() ? "OCUPADO" : "LIVRE");
    }

    public static void main(String[] args) {
        Quarto q1 = new Quarto(101, TipoQuarto.SIMPLES, 150.00);
        Quarto q2 = new Quarto(202, TipoQuarto.DUPLO, 250.00);
        Quarto q3 = new Quarto(301, TipoQuarto.SUITE, 480.00);

        status(q1); status(q2); status(q3);

        System.out.println("Reservar 101: " + q1.reservar());
        System.out.println("Reservar 101 novamente: " + q1.reservar());
        System.out.println("Reservar 301: " + q3.reservar());
        status(q1); status(q2); status(q3);

        System.out.printf("Estadia 101 por 3 dias: R$ %.2f%n", q1.calcularValor(3));
        System.out.printf("Estadia 301 por 5 dias: R$ %.2f%n", q3.calcularValor(5));

        System.out.println("Liberar 101: " + q1.liberar());
        System.out.println("Liberar 101 novamente: " + q1.liberar());
        System.out.println("Liberar 202 (nunca reservado): " + q2.liberar());
        status(q1); status(q2); status(q3);

        try { q1.calcularValor(0); System.out.println("ERRO"); }
        catch (IllegalArgumentException e) { System.out.println("Recusado: " + e.getMessage()); }
        try { new Quarto(999, TipoQuarto.DUPLO, -10); System.out.println("ERRO"); }
        catch (IllegalArgumentException e) { System.out.println("Recusado: " + e.getMessage()); }
    }
}
