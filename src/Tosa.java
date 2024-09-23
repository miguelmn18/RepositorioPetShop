import java.time.LocalDate;

public class Tosa extends ServicoBase{
    public Tosa(LocalDate data, String codigo, String tamanhoAnimal, double preco) {
        super(data, codigo, tamanhoAnimal, preco);
    }
    public double getPreco(){
        return 0;
    }
    public String getDescricao(){
        return null;
    }
}
