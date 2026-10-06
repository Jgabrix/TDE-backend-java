package exe03;

public class VeiculoMain {

    public static void main(String[] args) {

        // ---- Criando veículos ----
        Veiculo v1 = new Veiculo("Toyota", "Corolla", 2022, "Prata");
        Veiculo v2 = new Veiculo("Volkswagen", "Gol", 2018, "Branco");
        Veiculo v3 = new Veiculo("Honda", "Civic", 2020, "Preto");
        Veiculo v4 = new Veiculo("Fiat", "Uno", 2015, "Vermelho");

        // ---- Teste 1: Exibir dados de cada veículo ----
        System.out.println(">>> TESTE 1: Exibindo todos os veículos");
        v1.exibirDados();
        v2.exibirDados();
        v3.exibirDados();
        v4.exibirDados();

        // ---- Teste 2: Testando getters individualmente ----
        System.out.println(">>> TESTE 2: Testando getters do veículo 1");
        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Ano: " + v1.getAno());
        System.out.println("Cor: " + v1.getCor());
        System.out.println();

        // ---- Teste 3: Usando toString() ----
        System.out.println(">>> TESTE 3: Usando toString()");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println();

        // ---- Teste 4: Verificando se os atributos foram corretamente atribuídos ----
        System.out.println(">>> TESTE 4: Validação de atribuições");
        if (v1.getMarca().equals("Toyota") && v1.getAno() == 2022) {
            System.out.println("v1 atribuído corretamente.");
        } else {
            System.out.println("Erro na atribuição de v1.");
        }

        if (v4.getModelo().equals("Uno") && v4.getCor().equals("Vermelho")) {
            System.out.println("v4 atribuído corretamente.");
        } else {
            System.out.println("Erro na atribuição de v4.");
        }
    }
}