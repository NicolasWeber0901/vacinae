/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuário
 */
public class TableModelAgendamento extends AbstractTableModel {

    private ArrayList<Agendamento> agendamentos;

    public TableModelAgendamento(ArrayList<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return this.agendamentos;
    }

    public void setAgendamentos(ArrayList<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public int getRowCount() {
        return this.agendamentos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    //Valores da tabela.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Agendamento ag = this.agendamentos.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return ag.getCpfPac();
            }

            case 1: {
                return ag.getNomePac();
            }

            case 2: {
                return ag.getData();
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
                return "CPF";
            }

            case 1: {
                return "Nome";
            }

            case 2: {
                return "Data";
            }

            default: {
                return "-:-";
            }
        }
    }

    public void removeRow(int linha) {
        this.agendamentos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
