package exe07;


public class NotaMain {

    public static void main(String[] args) {

        // ---- Teste 1: Criando a primeira nota fiscal ----
        System.out.println(">>> TESTE 1: Criando nota fiscal 1");
        NotaFiscal nota1 = new NotaFiscal("P001", "Parafuso Sextavado", 100, 0.75);
        nota1.exibirNota();

        // ---- Teste 2: Criando a segunda nota fiscal ----
        System.out.println(">>> TESTE 2: Criando nota fiscal 2");
        NotaFiscal nota2 = new NotaFiscal("P002", "Rolamento Industrial", 5, 89.90);
        nota2.exibirNota();

        // ---- Teste 3: Criando a terceira nota fiscal ----
        System.out.println(">>> TESTE 3: Criando nota fiscal 3");
        NotaFiscal nota3 = new NotaFiscal("P003", "Correia Dentada", 10, 45.50);
        nota3.exibirNota();

        // ---- Teste 4: Testando getters ----
        System.out.println(">>> TESTE 4: Testando getters da nota 1");
        System.out.println("Número da peça: " + nota1.getNumeroPeca());
        System.out.println("Descrição: " + nota1.getDescricaoPeca());
        System.out.println("Quantidade: " + nota1.getQuantidadeComprada());
        System.out.printf("Preço: R$ %.2f%n%n", nota1.getPreco());

        // ---- Teste 5: Testando setters ----
        System.out.println(">>> TESTE 5: Testando setters na nota 2");
        nota2.setNumeroPeca("P002-ATUALIZADO");
        nota2.setDescricaoPeca("Rolamento Industrial Reforçado");
        nota2.setQuantidadeComprada(8);
        nota2.setPreco(99.99);
        nota2.exibirNota();

        // ---- Teste 6: Verificando o total de notas criadas ----
        System.out.println(">>> TESTE 6: Total de notas fiscais criadas");
        System.out.println("Total de notas: " + NotaFiscal.getTotalNota());

        // ---- Teste 7: Criando mais uma nota para validar o contador ----
        System.out.println("\n>>> TESTE 7: Criando mais uma nota fiscal");
        NotaFiscal nota4 = new NotaFiscal("P004", "Óleo Lubrificante", 20, 32.00);
        System.out.println("Total de notas após criar mais uma: " + NotaFiscal.getTotalNota());
    }
}
