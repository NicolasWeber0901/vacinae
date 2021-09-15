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
public class Agendamento {

    private String data;
    private String nomePaciente;
    private int cpfPac;

    public Agendamento(String data, String nomePaciente, int cpfPac) {
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.cpfPac = cpfPac;
    }

    public String getData() {
        return data;
    }

    public String getNomePac() {
        return nomePaciente;
    }

    public int getCpfPac() {
        return this.cpfPac;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Agendamento= " + " data: " + data + ", paciente: " + nomePaciente;
    }

}
