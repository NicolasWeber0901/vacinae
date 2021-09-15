package Model;

import java.util.ArrayList;

public class Estoque {

    private String nome;
    private ArrayList<Vacina> vacinas;

    public Estoque(String nome) {
        this.nome = nome;
        this.vacinas = new ArrayList<>();
    }

    public void addVacina(Vacina vacina) {
        this.vacinas.add(vacina);
    }

    public void listaVacina() {
        for (Vacina vac : vacinas) {
            System.out.println(vac.toString());
        }
    }

    public String listaVacina(String nome) {
        for (Vacina vac : vacinas) {
            if (vac.getNome() == nome) {
                return vac.toString();
            }
        }
        return "Não foi possível encontrar";
    }

    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }
}
