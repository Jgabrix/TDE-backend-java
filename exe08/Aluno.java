package exe08;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private List<Double> notas;

    // Construtor
    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    // Métodos solicitados

    /**
     * Adiciona uma nota à lista de notas do aluno.
     * Valida se a nota está entre 0 e 10.
     */
    public void adicionarNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Deve estar entre 0 e 10.");
            return;
        }
        notas.add(nota);
    }

    /**
     * Calcula a média aritmética das notas.
     * Retorna 0 caso não haja notas cadastradas.
     */
    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0;
    }

    public void exibirSituacao() {
        System.out.println("===== Dados do Aluno =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Notas: " + notas);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + (verificarAprovacao() ? "APROVADO ✅" : "REPROVADO ❌"));
        System.out.println("===========================\n");
    }

    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", notas=" + notas +
                '}';
    }
}