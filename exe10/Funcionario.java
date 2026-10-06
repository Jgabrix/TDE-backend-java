package exe010;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String matricula;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String matricula, String departamento) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public String getMatricula() { return matricula; }
    public String getDepartamento() { return departamento; }

    // 'aumento' é o valor em reais somado ao salário atual
    public void promover(String novoCargo, double aumento) {
        if (novoCargo == null || novoCargo.isBlank()) {
            throw new IllegalArgumentException("Novo cargo inválido");
        }
        if (aumento <= 0) {
            throw new IllegalArgumentException("O aumento deve ser positivo: " + aumento);
        }
        this.cargo = novoCargo;
        this.salario += aumento;
    }

    public void transferir(String novoDepartamento) {
        if (novoDepartamento == null || novoDepartamento.isBlank()) {
            throw new IllegalArgumentException("Departamento inválido");
        }
        this.departamento = novoDepartamento;
    }

    public void exibirDados() {
        System.out.printf("Matrícula: %s | Nome: %s | Cargo: %s | Departamento: %s | Salário: R$ %.2f%n",
                matricula, nome, cargo, departamento, salario);
    }
}
