public class Parser {
    public static Expressao parse(String comando){
        comando = comando.trim();

        if(comando.startsWith("caixa_alta(") && comando.endsWith(")")) {
            String conteudo = extrairConteudo(comando, "caixa_alta(");
            return new CaixaAltaExpressao(parseTexto(conteudo));
        }
        else if(comando.startsWith("repetir(") && comando.endsWith(")")) {
            String conteudo = extrairConteudo(comando, "repetir(");
            int indiceVirgula = encontrarIndiceVirgula(conteudo);

            if (indiceVirgula > 0) {
                String numStr = conteudo.substring(0, indiceVirgula).trim();
                String texto = conteudo.substring(indiceVirgula + 1).trim();

                int num = Integer.parseInt(numStr);
                return new RepetirExpressao(num, parseTexto(texto));

            }
        }
        throw new IllegalArgumentException("Comando não reconhecido: " + comando);
    }
    private static String extrairConteudo(String comando, String prefixo) {
        return comando.substring(prefixo.length(), comando.length() - 1);
    }
    private static int encontrarIndiceVirgula(String texto){
        int nivelAspas = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == '"') {
                nivelAspas = (nivelAspas == 0) ? 1 : 0;
            } else if (c == ',' && nivelAspas == 0) {
                return i;
            }
        }
        return -1;
    }
    private static Expressao parseTexto(String texto) {
        texto = texto.trim();
        if(texto.startsWith("\"") && texto.endsWith("\"")){
            return new TextoExpressao(texto.substring(1, texto.length() - 1));
        }
        return new TextoExpressao(texto);
    }
}


