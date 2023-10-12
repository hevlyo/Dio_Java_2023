public class iPhone implements Telefone, ReprodutorMusical, NavegadorInternet{
    private String modelo;
    private String cor;
    private int capacidadeArmazenamento;
    private double versaoIOS;

    public iPhone(String modelo, String cor, int capacidadeArmazenamento, double versaoIOS) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.versaoIOS = versaoIOS;
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligardesligar() {
        System.out.println("Desligando...");
    }

    public void abrirCamera() {
        System.out.println("Abrindo câmera...");
    }

    public void abrirMapas() {
        System.out.println("Abrindo mapas...");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando à internet...");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void armazenarDados(String dados) {
        System.out.println("Armazenando dados: " + dados);
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void enviarMensagem(String mensagem, String numero) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }
}
