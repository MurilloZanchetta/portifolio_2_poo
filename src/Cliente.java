public class Cliente extends Pessoa {
    private boolean financeiroAprova;

    public Cliente(int id, String nome, String dataNasc, String docIdentificacao, boolean financeiroAprova) {
        super(id, nome, dataNasc, docIdentificacao);
        this.financeiroAprova = financeiroAprova;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Financeiro Aprova: " + financeiroAprova);
    }
}
