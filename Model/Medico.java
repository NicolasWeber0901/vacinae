/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuário
 */
public class Medico extends Pessoa {

    private String formacao;

    public Medico(String formacao, String nome, int idade, int cpf, int telefone, Endereco endereco) {
        super(nome, idade, cpf, telefone, endereco);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return this.formacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", formação: " + this.formacao;
    }

}
