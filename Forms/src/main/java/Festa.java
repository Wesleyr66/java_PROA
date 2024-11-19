import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Festa {

    LocalDate data;
    LocalTime horario;
    float capacidade;
    boolean enfeites;
    float valor;

    void remarcar(){
    }
    void atrasar(){
    }
    void cancelar(){
    }

    void estado(){
        System.out.println("O dia é" + data);
        System.out.println("O horario é" + horario);
        System.out.println("A capacidade é" + capacidade);
        System.out.println("Enfeites:" + enfeites);
        System.out.println("O valor é:" + valor);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isEnfeites() {
        return enfeites;
    }

    public void setEnfeites(boolean enfeites) {
        this.enfeites = enfeites;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
