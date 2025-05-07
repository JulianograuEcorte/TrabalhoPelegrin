public class MensagemAgradecimento implements Mensagem{
    @Override
    public String formatar(String nome) {
        return "Obrigado por usar nosso programa, " + nome + "!";
    }
}
