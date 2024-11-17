public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(int id, String marca, String modelo, double valorLocacaoDia, int ano, int quilometragem, int cilindradas) {
        super(id, marca, modelo, valorLocacaoDia, ano, quilometragem);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
