package exe09;

public class Quarto {
    private int numero;
    private TipoQuarto tipo;
    private double precoPorNoite;
    private boolean estaOcupado;

    public Quarto(int numero, TipoQuarto tipo, double precoPorNoite) {
        if (precoPorNoite <= 0) {
            throw new IllegalArgumentException("Preço por noite deve ser positivo");
        }
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.estaOcupado = false; // todo quarto começa livre
    }

    public int getNumero() { return numero; }
    public TipoQuarto getTipo() { return tipo; }
    public double getPrecoPorNoite() { return precoPorNoite; }
    public boolean isOcupado() { return estaOcupado; }

    public boolean reservar() {
        if (estaOcupado) {
            return false;
        }
        estaOcupado = true;
        return true;
    }

    public boolean liberar() {
        if (!estaOcupado) {
            return false;
        }
        estaOcupado = false;
        return true;
    }

    public double calcularValor(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Número de dias deve ser positivo: " + dias);
        }
        return dias * precoPorNoite;
    }
}
