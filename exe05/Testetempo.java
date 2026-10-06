package exe05;

public class Testetempo {
    public static void main(String[] args) {
        Tempo t = new Tempo(2, 30, 45);

        // Imprime no formato hh:mm:ss
        t.imprimir();

        // Total de minutos
        System.out.println("Total de minutos: " + t.calcularMinutos());

        // Total de segundos
        System.out.println("Total de segundos: " + t.calcularSegundos());

        // Testando os setters
        t.setHoras(5);
        t.setMinutos(15);
        t.setSegundos(10);

        t.imprimir();
    }
}