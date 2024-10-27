import java.util.ArrayList;
import java.util.List;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<String> historico = new ArrayList<>();
    private String musicaAtual;

    // Implementação de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarConferencia(String[] numeros) {
        System.out.print("Iniciando conferência com: ");
        for (String numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    // Implementação de NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        historico.add(url);
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (!historico.isEmpty()) {
            System.out.println("Atualizando página: " + historico.get(historico.size() - 1));
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Histórico de navegação:");
        for (String url : historico) {
            System.out.println(url);
        }
    }
}
