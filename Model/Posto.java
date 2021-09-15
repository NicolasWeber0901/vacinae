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
public class Posto {

    /*
    Criação da variável estática. Criada dessa forma para manter a mesma 
    instância durante toda a execução do programa. Variáveis estáticas 
    pertencem a classe e não ao objeto. Por isso quando declaradas, devem ser
    utilizadas através da classe.
     */
    private static Posto posto;

    private String nome;
    private int telefone;
    private Endereco endereco;
    private Estoque estoque;
    private ArrayList<Agendamento> agendamentos;
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;

    public Posto(String nome, int telefone, Endereco endereco, Estoque estoque) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.estoque = estoque;
        this.agendamentos = new ArrayList<Agendamento>();
        this.medicos = new ArrayList<Medico>();
        this.pacientes = new ArrayList<Paciente>();
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public void addMedico(Medico medico) {
        this.medicos.add(medico);
    }

    public void addAgendamento(Agendamento agendamento) {
        this.agendamentos.add(agendamento);
    }

    public String listaAgendamentoNome(String nome) {
        for (Agendamento ag : agendamentos) {
            if (nome == ag.getNomePac()) {
                return ag.toString();
            }
        }
        return "Não foi possivel encontrar";
    }

    public String listaAgendamento(int cpf) {
        for (Agendamento ag : agendamentos) {
            if (cpf == ag.getCpfPac()) {
                return ag.toString();
            }
        }
        return "Não foi possivel encontrar";
    }

    public String listaAgendamento(String data) {
        for (Agendamento ag : agendamentos) {
            if (data == ag.getData()) {
                return ag.toString();
            }
        }
        return "Não foi possivel encontrar";
    }

    public void cancelaAgendamento(Agendamento ag) {
        this.agendamentos.remove(ag);
    }

    public ArrayList<Medico> getMedicos() {
        return this.medicos;
    }

    public ArrayList<Paciente> getPacientes() {
        return this.pacientes;
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return this.agendamentos;
    }

    public Estoque getEstoque() {
        return this.estoque;
    }
    

    /*
    Criação da instância da variável estática. Quando ela é chamada pela 
    primeira vez na classe SistemaPostoView, ela está nula e a partir disso é 
    criada uma instância para o posto que será utilizada por todas as outras 
    classes que a solicitarem mais tarde.
     */
    public static Posto getPosto() {
        if (Posto.posto == null) {
            Endereco end = new Endereco("Alberto Koglin", "Centro", "Dona Emma", 167);
            Estoque estoque = new Estoque("Estoque Posto 1");
            Posto.posto = new Posto("Posto 1", 99999999, end, estoque);
        }
        return Posto.posto;
    }

}
