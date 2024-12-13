package model;

public class Garcom {
    private String nome;
    private String codigo;
    private String telefone;
    private String email;

    public Garcom(String nome, String codigo, String telefone, String email) {
        this.nome = nome;
        this.codigo = codigo;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Garcom [nome=" + nome + ", codigo=" + codigo + ", telefone=" + telefone + ", email=" + email + "]";
    }
}
