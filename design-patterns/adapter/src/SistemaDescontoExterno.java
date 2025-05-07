public class SistemaDescontoExterno {
    public double aplicarDesccontoPercentual(double valor, double percentual){
        return valor - (valor * percentual / 100);
    }
}
