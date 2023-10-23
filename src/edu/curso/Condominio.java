package edu.curso;

public class Condominio {
    private int codCondominio;
    private String dataPagamento;
    private double valorPago;
    private boolean condominioAtraso;
    private boolean pagarAtrasoProximoMes;
    private Proprietario condominio;

    public Condominio(int codigo, String data, double valor, boolean atraso, boolean atraso2x, Proprietario p1) {
        this.codCondominio = codigo;
        this.dataPagamento = data;
        this.valorPago = valor;
        this.condominioAtraso = atraso;
        this.pagarAtrasoProximoMes = atraso2x;
        this.condominio = p1;
    }

    public double calcularDespesa(double totalQuartos, Despesa despesa, int quartosApartamento) {
        double valorDespesa = despesa.getValorDespesa();
        if(condominioAtraso) {
            double valorDespesaComMulta = despesa.getValorDespesa();
            double valorNormal = ((valorDespesaComMulta / totalQuartos) * quartosApartamento);
            double atraso = valorNormal * 0.02;
            return valorNormal * atraso;
        }

        if(pagarAtrasoProximoMes) {
            double valorDespesaComMulta = despesa.getValorDespesa();
            double valorNormal = ((valorDespesaComMulta / totalQuartos) * quartosApartamento);
            double atraso = valorNormal * 0.05;
            return valorNormal * atraso;
        }
        return ((valorDespesa / totalQuartos) * quartosApartamento);
    }

    public String getDataPagamento() {
        return this.dataPagamento;
    }


}
