package br.com.unipds.fundamentosjava.desafio.model;

import br.com.unipds.fundamentosjava.desafio.util.ValidaDados;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    private final ValidaDados validaDados = new ValidaDados();

    public Produto(int id, String nome, double preco, int quantidadeEmEstoque)  {

        validaDados.validaGeral(nome,preco,quantidadeEmEstoque);

        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setPreco(double preco) {
        validaDados.valitaPrco(preco);
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        validaDados.validaQuantidade(quantidadeEmEstoque);
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto [ID=" + id + ", Nome=" + nome + ", Preço=" + preco + ", Estoque=" + quantidadeEmEstoque + "]";
    }
}
