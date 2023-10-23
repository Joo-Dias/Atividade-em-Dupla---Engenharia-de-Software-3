package edu.curso;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<Apartamento> apartamentos = new ArrayList<>();
        Proprietario p1 = new Proprietario("João", "11953140656");
        Proprietario p2 = new Proprietario("Murilo Ramos", "40028922");

        apartamentos.add(new Apartamento(1, 5, "Proprietário", p1));
        apartamentos.add(new Apartamento(2, 6, "Proprietário", p2));

        Apartamento ap1qtdQuarto = apartamentos.get(0);
        Apartamento ap2qtdQuarto = apartamentos.get(1);

        int qntdQuartos1 = ap1qtdQuarto.getQuantidadeQuartos();
        int qntdQuartos2 = ap2qtdQuarto.getQuantidadeQuartos();

        int totalQuartos = 0;
        for (Apartamento apartamento : apartamentos) {
            totalQuartos = totalQuartos + apartamento.getQuantidadeQuartos();
        }

        Despesa agua = new DespesaVariavel(1, 150, "23/09/2023");
        Despesa luz = new DespesaVariavel(2, 150, "23/09/2023");

        Condominio c1 = new Condominio(1, "26/10/2023", 400, false, false, p1);
        Condominio c2 = new Condominio(2, "15/10/2023", 500, false, true, p2);

        System.out.println(c1.calcularDespesa(totalQuartos, agua, qntdQuartos1));
        System.out.println(c2.calcularDespesa(totalQuartos, luz, qntdQuartos2));

        System.out.println("BOLETO DO CONDOMINO "+ p1.getNome());
        System.out.println("Valor pago: " + c1.calcularDespesa(totalQuartos, agua, qntdQuartos1));
        System.out.println("Data do Pagamento: " + c1.getDataPagamento());

        System.out.println("==========================");

        System.out.println("BOLETO DO CONDOMINO "+ p2.getNome());
        System.out.println("Valor pago: " + c2.calcularDespesa(totalQuartos, agua, qntdQuartos1));
        System.out.println("Data do Pagamento: " + c2.getDataPagamento());




    }
}
