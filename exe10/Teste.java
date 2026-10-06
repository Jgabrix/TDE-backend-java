package exe010;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcos", "Desenvolvedor Júnior", 3500.00, "F001", "TI");
        Funcionario f2 = new Funcionario("Luciana", "Analista de RH", 4200.00, "F002", "Recursos Humanos");

        System.out.println("Antes:");
        f1.exibirDados();
        f2.exibirDados();

        f1.promover("Desenvolvedor Pleno", 1500.00);
        f1.transferir("Engenharia de Software");
        f2.transferir("Financeiro");

        System.out.println("Depois:");
        f1.exibirDados();
        f2.exibirDados();

        try { f2.promover("Gerente", -100); System.out.println("ERRO"); }
        catch (IllegalArgumentException e) { System.out.println("Recusado: " + e.getMessage()); }
        try { f2.promover("", 500); System.out.println("ERRO"); }
        catch (IllegalArgumentException e) { System.out.println("Recusado: " + e.getMessage()); }
        try { f2.transferir("  "); System.out.println("ERRO"); }
        catch (IllegalArgumentException e) { System.out.println("Recusado: " + e.getMessage()); }

        System.out.println("Após tentativas inválidas:");
        f2.exibirDados();
    }
}
