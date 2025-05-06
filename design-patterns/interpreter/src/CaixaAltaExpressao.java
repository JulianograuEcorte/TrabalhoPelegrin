public class CaixaAltaExpressao implements Expressao {
    private final Expressao expressao;

    public CaixaAltaExpressao( Expressao expressao ) {
        this.expressao = expressao;
    }
    @Override
    public String interpretar() {
        String textoOriginal = expressao.interpretar();
        char[] chars = new char[textoOriginal.length()];
        for (int i = 0; i < textoOriginal.length(); i++) {
            char c = textoOriginal.charAt(i);
            if(c >= 'a' && c <= 'z'){
                chars[i] = (char) (c - 32);
            }
            else {
                chars[i] = c;
            }
        }
        return new String(chars);
    }
}
