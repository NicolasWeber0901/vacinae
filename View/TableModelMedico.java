package View;

import Model.Medico;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

// Modelo de tabela criado para formatar a tabela de listagem de médicos.
public class TableModelMedico extends AbstractTableModel {

    private ArrayList<Medico> medicos;

    public TableModelMedico(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Medico> getMedicos() {
        return this.medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    //Definição da quantidade de linhas.
    @Override
    public int getRowCount() {
        return this.medicos.size();
    }

    //Definição da quantidade de colunas (no caso a quantidade de atributos na tela).
    @Override
    public int getColumnCount() {
        return 5;
    }

    //Valores da tabela
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Medico med = this.medicos.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return med.getNome();
            }

            case 1: {
                return med.getCpf();
            }

            case 2: {
                return med.getFormacao();
            }

            case 3: {
                return med.getTelefone();
            }

            case 4: {
                return med.getEndereco().toString();
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
                return "Formação";
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
