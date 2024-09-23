import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Hotelzinho extends ServicoBase {
    int quantidadeDeHoras;
    public Hotelzinho(LocalDate data, String codigo, String tamanhoAnimal, double preco, int quantidadeDeHoras) {
        super(data, codigo, tamanhoAnimal, preco);
        this.quantidadeDeHoras = quantidadeDeHoras;
    }

    public int getQuantidadeDeHoras() {
        return quantidadeDeHoras;
    }

    public void setQuantidadeDeHoras(int quantidadeDeHoras) {
        this.quantidadeDeHoras = quantidadeDeHoras;
    }
    public double getPreco(){
        return 0;
    }

    public String getDescricao(){
        return null;
    }
}
