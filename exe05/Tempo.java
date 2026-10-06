package exe05;

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;

    // Construtor padrão (inicializa com zero)
    public Tempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }


    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    public int getMinutos() { return minutos; }
    public void setMinutos(int minutos) { this.minutos = minutos; }

    public int getSegundos() { return segundos; }
    public void setSegundos(int segundos) { this.segundos = segundos; }

    public void imprimir() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

    public int calcularMinutos() {
        return horas * 60 + minutos;
    }

    public int calcularSegundos() {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public double converterParaHoras() {
        return horas + (minutos / 60.0) + (segundos / 3600.0);
    }

    public double diferencaEmHoras(Tempo outro) {
        double totalEste = this.converterParaHoras();
        double totalOutro = outro.converterParaHoras();
        return Math.abs(totalEste - totalOutro);
    }
}