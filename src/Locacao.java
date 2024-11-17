public class Locacao {
    private int id;
    private String dataInicio;
    private String dataFim;

    public Locacao(int id, String dataInicio, String dataFim) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void imprimirTicket() {
        System.out.println("Imprimindo ticket...");
    }

    public void faturarServico() {
        System.out.println("Faturando serviço...");
    }

    public void mostrarDados() {
        System.out.println("ID Locação: " + id);
        System.out.println("Data Início: " + dataInicio);
        System.out.println("Data Fim: " + dataFim);
    }
}
