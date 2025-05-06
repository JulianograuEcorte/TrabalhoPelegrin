public class RepetirExpressao implements Expressao {
    private final int vezes;
    private final Expressao expressao;

    public RepetirExpressao( int vezes, Expressao expressao ) {
        this.vezes = vezes;
        this.expressao = expressao;
    }
    @Override
    public String interpretar() {
        String texto = expressao.interpretar();
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < vezes; i++) {
            resultado.append(texto);
        }
        return resultado.toString();
    }
}
