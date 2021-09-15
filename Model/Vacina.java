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
public class Vacina {

    private String nome;
    private double valor;
    private int quantidade;
    private Fabricante fabricante;

    public Vacina(String nome, double valor, int quantidade, Fabricante fabricante) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public Fabricante getFabricante() {
        return this.fabricante;
    }

    public boolean descontar(int qtd) {

        if (qtd > 0) {
            this.quantidade -= qtd;
            return true;
        }
        return false;
    }

    public boolean adicionar(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", valor: " + this.valor + ", qtd: "
                + this.quantidade + ", fabricante: " + this.fabricante + '}';
    }
}
