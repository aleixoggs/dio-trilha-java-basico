public class App {
    public static void main(String[] args) {
       
        iPhone meuIPhone = new iPhone();

        // Testando ReprodutorMusical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando AparelhoTelefonico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

