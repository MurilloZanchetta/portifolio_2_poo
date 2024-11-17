public class Pessoa {
    private int id;
    private String nome;
    private String dataNasc;
    private String docIdentificacao;

    public Pessoa(int id, String nome, String dataNasc, String docIdentificacao) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.docIdentificacao = docIdentificacao;
    }

    public void mostrarDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("Documento de Identificação: " + docIdentificacao);
    }
}
