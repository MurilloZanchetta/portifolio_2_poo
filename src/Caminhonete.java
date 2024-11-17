public class Caminhonete extends Veiculo {
    private int capacidadeCarga;

    public Caminhonete(int id, String marca, String modelo, double valorLocacaoDia, int ano, int quilometragem, int capacidadeCarga) {
        super(id, marca, modelo, valorLocacaoDia, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
    }
}
