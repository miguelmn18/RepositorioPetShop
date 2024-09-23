import java.time.LocalDate;
import java.util.Date;

public abstract class  ServicoBase implements ServicoPetShopIF {
    private LocalDate data;
    private String codigo;
    private String tamanhoAnimal;
    private double preco;

    public ServicoBase(LocalDate data, String codigo, String tamanhoAnimal, double preco) {
        this.data = data;
        this.codigo = codigo;
        this.tamanhoAnimal = tamanhoAnimal;
        this.preco = preco;
    }

    @Override
    public String getCodigo() {
        return null;
    }

    @Override
    public LocalDate getData() {
        return null;
    }

    @Override
    public String getDescricao() {
        return null;
    }

    @Override
    public String getTamanhoAnimal() {
        return null;
    }

    @Override
    public double getPreco() {
        return 0;
    }
}
