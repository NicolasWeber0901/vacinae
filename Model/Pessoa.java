/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected int cpf;
    protected int telefone;
    protected Endereco endereco;

    public Pessoa(String nome, int idade, int cpf, int telefone, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getCpf() {
        return this.cpf;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public String toString() {
        return this.nome + ", " + this.idade + ", "
                + this.cpf + ", " + this.telefone;
    }

}
