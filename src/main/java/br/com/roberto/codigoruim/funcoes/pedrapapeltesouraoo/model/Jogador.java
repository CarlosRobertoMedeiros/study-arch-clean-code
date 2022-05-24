package br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.model;

import br.com.roberto.codigoruim.funcoes.pedrapapeltesouraoo.enums.Mao;

public class Jogador {
    private final String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Mao jogar(){
        return  Mao.aleatoria();
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
