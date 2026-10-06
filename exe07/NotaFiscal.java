package exe07;

public class NotaFiscal {

    // Atributos
    private String numeroPeca;
    private String descricaoPeca;
    private int quantidadeComprada;
    private double preco;

    // Atributo estático para contar instâncias criadas
    private static int totalNotas = 0;

    // Construtor
    public NotaFiscal(String numeroPeca, String descricaoPeca, int quantidadeComprada, double preco) {
        this.numeroPeca = numeroPeca;
        this.descricaoPeca = descricaoPeca;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
        totalNotas++; // incrementa o contador a cada nova instância
    }

    // Getters e Setters
    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna o total de notas fiscais (instâncias) criadas.
     */
    public static int getTotalNota() {
        return totalNotas;
    }

    /**
     * Calcula o valor total da nota (quantidade * preço).
     */
    public double calcularValorTotal() {
        return quantidadeComprada * preco;
    }

    /**
     * Exibe os dados da nota fiscal formatados.
     */
    public void exibirNota() {
        System.out.println("===== Nota Fiscal =====");
        System.out.println("Número da Peça: " + numeroPeca);
        System.out.println("Descrição: " + descricaoPeca);
        System.out.println("Quantidade: " + quantidadeComprada);
        System.out.printf("Preço Unitário: R$ %.2f%n", preco);
        System.out.printf("Valor Total: R$ %.2f%n", calcularValorTotal());
        System.out.println("=======================\n");
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numeroPeca='" + numeroPeca + '\'' +
                ", descricaoPeca='" + descricaoPeca + '\'' +
                ", quantidadeComprada=" + quantidadeComprada +
                ", preco=" + preco +
                '}';
    }
}
