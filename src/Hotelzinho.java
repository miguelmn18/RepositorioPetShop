import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Hotelzinho extends ServicoBase {
    int quantidadeDeHoras;

    public Hotelzinho(String tamanhoAnimal, int preco, int quantidadeDeHoras) {
        super(tamanhoAnimal, preco);
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    public int getQuantidadeDeHoras() {
        return quantidadeDeHoras;
    }

    public void setQuantidadeDeHoras(int quantidadeDeHoras) {
        this.quantidadeDeHoras = quantidadeDeHoras;
    }
    public int getPreco(){
        return 0;
    }

    public String getDescricao(){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hotelzinho that = (Hotelzinho) o;
        return quantidadeDeHoras == that.quantidadeDeHoras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantidadeDeHoras);
    }

    @Override
    public String toString() {
        return "Hotelzinho{" + "Data= " + super.getData() +
                "Código=" + super.getCodigo() +
                "TamanhoAnimal=" + super.getTamanhoAnimal() +
                "Preco=" + super.getPreco() +
                "quantidadeDeHoras=" + quantidadeDeHoras +
                '}';
    }
}
