public class TextoExpressao implements Expressao {
    private final char[] texto;

    public TextoExpressao(String texto ) {
        this.texto = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            this.texto[i] = texto.charAt(i);
        }
    }

    @Override
    public String interpretar() {
        return new String(texto);
    }
}
