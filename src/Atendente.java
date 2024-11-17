public class Atendente extends Pessoa {
    private boolean admin;

    public Atendente(int id, String nome, String dataNasc, String docIdentificacao, boolean admin) {
        super(id, nome, dataNasc, docIdentificacao);
        this.admin = admin;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Admin: " + admin);
    }
}
