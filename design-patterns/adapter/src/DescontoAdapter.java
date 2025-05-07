public class DescontoAdapter implements CalculadoraDesconto {
    private SistemaDescontoExterno sistemaDescontoExterno;

    public DescontoAdapter(){
        this.sistemaDescontoExterno = new SistemaDescontoExterno();
    }

    @Override
    public double calcular(double valor, double percentual) {
        return sistemaDescontoExterno.aplicarDesccontoPercentual(valor, percentual);
    }
}
