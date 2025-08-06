package br.com.unipds.fundamentosjava.desafio;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEmEstoque)  {
        this.id = id;
        if(nome != null && !nome.isBlank()){
            this.nome = nome;
        }else{
            throw new ExceptionProduto("Nome do produto " + id + " não pode ser nulo ou vazio" );
        }
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new ExceptionProduto("Preço do produto " + id + " não pode ser negativo");
        }
        if(quantidadeEmEstoque > 0){
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }else {
            throw new ExceptionProduto("Quantidade do produto " + id + " não pode ter valor negativo ou zero");
        }
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new ExceptionProduto("Preço do produto " + id + " não pode ser negativo");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque > 0){
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }else {
            throw new ExceptionProduto("Quantidade do produto " + id + " não pode ter valor negativo ou zero");
        }
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isBlank()){
            this.nome = nome;
        }else{
            throw new ExceptionProduto("Nome do produto " + id + " não pode ser nulo ou vazio" );
        }
    }

    @Override
    public String toString() {
        return "Produto [ID=" + id + ", Nome=" + nome + ", Preço=" + preco + ", Estoque=" + quantidadeEmEstoque + "]";
    }
}
