package edu.curso;

abstract class Despesa{
    private int codDespesa;
    private double valorDespesa;
    private String dataDespesa;

    public Despesa(int codDespesa, double valorDespesa, String dataDespesa) {
        this.codDespesa = codDespesa;
        this.valorDespesa = valorDespesa;
        this.dataDespesa = dataDespesa;
    }

    public double getValorDespesa() {
        return valorDespesa;
    }

}
