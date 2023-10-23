package edu.curso;

import java.util.List;

public class Apartamento {
    private static final int NUMERO_AP = 0;
    private int numeroApartamento;
    private int quantidadeQuartos;
    private String tipoOcupacao;
    private IPessoa proprietario;

    public Apartamento(int numeroApartamento, int quantidadeQuartos, String tipoOcupacao, IPessoa proprietario) {
        this.numeroApartamento = numeroApartamento;
        this.quantidadeQuartos = quantidadeQuartos;
        this.tipoOcupacao = tipoOcupacao;
        this.proprietario = proprietario;
    }

    public double calcularDespesa(double valorTotalDespesa, int totalQuartos) {
        return valorTotalDespesa / totalQuartos * quantidadeQuartos;
    }

    public int getQuantidadeQuartos() {
        return this.quantidadeQuartos;
    }

}
