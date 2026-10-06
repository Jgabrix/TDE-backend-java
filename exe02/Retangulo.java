public class Retangulo {
    private double length = 1.0;
    private double width = 1.0;

    public Retangulo() {
    }

    public Retangulo(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (!(length > 0.0 && length < 20.0)) {
            throw new IllegalArgumentException("O comprimento deve ser maior que 0 e menor que 20.");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (!(width > 0.0 && width < 20.0)) {
            throw new IllegalArgumentException("A largura deve ser maior que 0 e menor que 20.");
        }
        this.width = width;
    }

    public double calcularPerimetro() {
        return 2.0 * (length + width);
    }

    public double calcularArea() {
        return length * width;
    }
}
