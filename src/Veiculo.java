public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private double valorLocacaoDia;
    private int ano;
    private int quilometragem;

    public Veiculo(int id, String marca, String modelo, double valorLocacaoDia, int ano, int quilometragem) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.valorLocacaoDia = valorLocacaoDia;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor Locação por Dia: " + valorLocacaoDia);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
    }
}
