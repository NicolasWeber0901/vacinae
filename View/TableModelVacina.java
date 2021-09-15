/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Vacina;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuário
 */
public class TableModelVacina extends AbstractTableModel {

    private ArrayList<Vacina> vacinas;

    public TableModelVacina(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    public ArrayList<Vacina> getVacinas() {
        return this.vacinas;
    }

    public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public int getRowCount() {
        return this.vacinas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    //Valores da tabela.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vacina vac = this.vacinas.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                return vac.getNome();
            }

            case 1: {
                return vac.getQuantidade();
            }

            case 2: {
                return vac.getValor();
            }

            case 3: {
                return vac.getFabricante();
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
                return "Quantidade";
            }

            case 2: {
                return "Valor";
            }

            case 3: {
                return "Fabricante";
            }

            default: {
                return "-:-";
            }
        }
    }

}
