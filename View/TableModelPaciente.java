/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Paciente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuário
 */
public class TableModelPaciente extends AbstractTableModel {

    private ArrayList<Paciente> pacientes;

    public TableModelPaciente(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Paciente> getPacientes() {
        return this.pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public int getRowCount() {
        return this.pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    //Valores da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Paciente pac = this.pacientes.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return pac.getNome();
            }

            case 1: {
                return pac.getCpf();
            }

            case 2: {
                return pac.getComorbidade();
            }

            case 3: {
                return pac.getTelefone();
            }

            case 4: {
                return pac.getEndereco().toString();
            }

            default: {
                return "Coluna sem valor";
            }
        }
    }

    //Títulos das colunas
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: {
                return "Nome";
            }

            case 1: {
                return "CPF";
            }

            case 2: {
                return "Comorbidade";
            }

            case 3: {
                return "Telefone";
            }

            case 4: {
                return "Endereço";
            }

            default: {
                return "-:-";
            }
        }
    }
}
