public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Lucas Custódio", "123.456.777-88", "04/07//1998");
        Clientes cliente2 = new Clientes("João Silva", "123.456.789-00", "02/04//1958");
        Banco contaBanco = new Banco("Agencia 001", cliente1, 1400.0, "166322-4");
        Banco contaBanco2 = new Banco("Agencia 001", cliente2, 1800.0, "664202-2");

        contaBanco2.exibirConta();
        cliente2.mostrarCliente();
        contaBanco2.EscolherOpcao();
        cliente2.mostrarCliente();
    }
}