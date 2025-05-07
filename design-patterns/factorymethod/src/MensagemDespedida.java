public class MensagemDespedida implements Mensagem {
    @Override
    public String formatar(String nome) {
        return "Tchau, " + nome + "!";
    }
}
