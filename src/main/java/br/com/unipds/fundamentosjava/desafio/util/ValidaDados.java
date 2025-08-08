package br.com.unipds.fundamentosjava.desafio.util;

import br.com.unipds.fundamentosjava.desafio.exception.ExceptionProduto;

public class ValidaDados {

    public void validaGeral(String nome,double preco, int quantidadeEmEstoque){
        validaNome(nome);
        valitaPrco(preco);
        validaQuantidade(quantidadeEmEstoque);
    }

    public void validaNome(String nome){
        if(nome == null || nome.isBlank() ){
            throw new ExceptionProduto("Nome do produto não pode ser nulo ou vazio");
        }
    }

    public void valitaPrco(double preco){
        if (preco < 0) {
            throw new ExceptionProduto("Preço do produto não pode ser negativo");
        }
    }

    public void validaQuantidade(int quantidadeEmEstoque){
        if(quantidadeEmEstoque < 0){
            throw new ExceptionProduto("Quantidade do produto não pode ter valor negativo ou zero");
        }
    }
}
