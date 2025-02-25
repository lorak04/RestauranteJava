package model;

public class Prato {
    private String nome;
    private String descricao;
    private double preco;

    public Prato(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Prato [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}
