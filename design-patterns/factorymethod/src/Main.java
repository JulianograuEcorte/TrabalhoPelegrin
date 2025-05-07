public class Main {
    public static void main(String[] args) {
        Mensagem m1 = MensagemFactory.criar("boasvindas");
        System.out.println(m1.formatar("Lucas"));

        Mensagem m2 = MensagemFactory.criar("despedida");
        System.out.println(m2.formatar("Ana"));

        Mensagem m3 = MensagemFactory.criar("agradecimento");
        System.out.println(m3.formatar("João"));
    }
}
