package br.com.roberto.codigoruim.estruturaobjetoseestruturadados;

import java.util.Objects;

//OBJETO
public class Pessoa {

    private String nome;
    private Integer idade;
    private String cidade;


    public Pessoa(String nome, Integer idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) && idade.equals(pessoa.idade) && cidade.equals(pessoa.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cidade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
