package br.com.roberto.codigoruim.exceptions;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String cidade;
    private String uf;

    public Pessoa(String nome, Integer idade, String cidade, String uf) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.uf = uf;
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

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
