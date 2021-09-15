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
public class Paciente extends Pessoa {

    private String comorbidade;

    public Paciente(String comorbidade, String nome, int idade, int cpf, int telefone, Endereco endereco) {
        super(nome, idade, cpf, telefone, endereco);
        this.comorbidade = comorbidade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getComorbidade() {
        return comorbidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", comorbidade: " + this.comorbidade;

    }

}
