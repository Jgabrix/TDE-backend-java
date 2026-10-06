package exe08;

public class alunoMain {
        public static void main(String[] args) {

            // ---- Teste 1: Aluno aprovado ----
            System.out.println(">>> TESTE 1: Aluno com média >= 7");
            Aluno aluno1 = new Aluno("Ana Silva", 20, "2024001", "Engenharia de Software");
            aluno1.adicionarNota(8.5);
            aluno1.adicionarNota(7.0);
            aluno1.adicionarNota(9.0);
            aluno1.exibirSituacao();

            // ---- Teste 2: Aluno reprovado ----
            System.out.println(">>> TESTE 2: Aluno com média < 7");
            Aluno aluno2 = new Aluno("Bruno Costa", 22, "2024002", "Ciência da Computação");
            aluno2.adicionarNota(5.0);
            aluno2.adicionarNota(6.0);
            aluno2.adicionarNota(4.5);
            aluno2.exibirSituacao();

            // ---- Teste 3: Aluno exatamente com média 7 ----
            System.out.println(">>> TESTE 3: Aluno com média exatamente 7");
            Aluno aluno3 = new Aluno("Carla Souza", 19, "2024003", "Sistemas de Informação");
            aluno3.adicionarNota(7.0);
            aluno3.adicionarNota(7.0);
            aluno3.adicionarNota(7.0);
            aluno3.exibirSituacao();

            // ---- Teste 4: Aluno sem notas ----
            System.out.println(">>> TESTE 4: Aluno sem notas cadastradas");
            Aluno aluno4 = new Aluno("Diego Lima", 21, "2024004", "Análise e Desenvolvimento");
            aluno4.exibirSituacao();

            // ---- Teste 5: Nota inválida ----
            System.out.println(">>> TESTE 5: Tentativa de adicionar nota inválida");
            Aluno aluno5 = new Aluno("Eva Martins", 23, "2024005", "Engenharia de Software");
            aluno5.adicionarNota(11.0); // inválida
            aluno5.adicionarNota(-1.0); // inválida
            aluno5.adicionarNota(8.0);  // válida
            aluno5.exibirSituacao();
        }
}
