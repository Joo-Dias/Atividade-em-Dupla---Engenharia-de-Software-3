package edu.curso;

public class Proprietario implements IPessoa{
    private String nomeProprietario;
    private String telefoneProprietario;

    public Proprietario(String nomeProprietario, String telefoneProprietario) {
        this.nomeProprietario = nomeProprietario;
        this.telefoneProprietario = telefoneProprietario;
    }

    public String getNome() {
        return nomeProprietario;
    }


    @Override
    public void pagarCondominio() {
        System.out.println("Pagando condominio!");
    }
}
