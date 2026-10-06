public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        validarData(mes, dia, ano);
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public void setMes(int mes) {
        validarData(mes, this.dia, this.ano);
        this.mes = mes;
    }

    public void setDia(int dia) {
        validarData(this.mes, dia, this.ano);
        this.dia = dia;
    }

    public void setAno(int ano) {
        validarData(this.mes, this.dia, ano);
        this.ano = ano;
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, ano);
    }

    public int calcularDiasAteMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            throw new IllegalArgumentException("O mês deve estar entre 1 e 12.");
        }

        int totalDias = 0;
        for (int mesAtual = 1; mesAtual <= numeroMes; mesAtual++) {
            totalDias += diasNoMes(mesAtual, ano);
        }
        return totalDias;
    }

    private static void validarData(int mes, int dia, int ano) {
        if (ano < 1) {
            throw new IllegalArgumentException("O ano deve ser maior que zero.");
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O mês deve estar entre 1 e 12.");
        }
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            throw new IllegalArgumentException("O dia não é válido para o mês e ano informados.");
        }
    }

    private static int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:
                return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}
