public class Carro extends Veiculo {
    private int numPortas;

    public Carro(int id, String marca, String modelo, double valorLocacaoDia, int ano, int quilometragem, int numPortas) {
        super(id, marca, modelo, valorLocacaoDia, ano, quilometragem);
        this.numPortas = numPortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de Portas: " + numPortas);
    }
}
