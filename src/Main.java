public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João", "10/05/1990", "123456789", true);

        Atendente atendente = new Atendente(2, "Maria", "15/08/1985", "987654321", true);

        Carro carro = new Carro(1, "Toyota", "Corolla", 150.0, 2020, 50000, 4);

        Motocicleta moto = new Motocicleta(2, "Honda", "CB500", 80.0, 2021, 15000, 500);

        Caminhonete caminhonete = new Caminhonete(3, "Ford", "Ranger", 200.0, 2022, 10000, 1200);

        Locacao locacao = new Locacao(1, "01/11/2024", "10/11/2024");

        System.out.println("Dados do Cliente:");
        cliente.mostrarDados();
        System.out.println();

        System.out.println("Dados do Atendente:");
        atendente.mostrarDados();
        System.out.println();

        System.out.println("Dados do Carro:");
        carro.mostrarDados();
        System.out.println();

        System.out.println("Dados da Motocicleta:");
        moto.mostrarDados();
        System.out.println();

        System.out.println("Dados da Caminhonete:");
        caminhonete.mostrarDados();
        System.out.println();

        System.out.println("Dados da Locação:");
        locacao.mostrarDados();
        System.out.println();

        System.out.println("Operações da Locação:");
        locacao.imprimirTicket();
        locacao.faturarServico();
    }
}
