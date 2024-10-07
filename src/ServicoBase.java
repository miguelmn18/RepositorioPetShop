import java.util.Date;
import java.util.Objects;
import java.util.Random;

public abstract class  ServicoBase implements ServicoPetShopIF {
    private Date data;
    private int codigo;
    private String tamanhoAnimal;
    private int preco;

    public ServicoBase( String tamanhoAnimal, int preco) {
        Random rand = new Random();
        this.codigo = rand.nextInt(1,9);
        this.tamanhoAnimal = tamanhoAnimal;
        this.preco = preco;
        data = new Date();

    }

    @Override
    public int getCodigo() {
        return 0;
    }

    @Override
    public Date getData() {
        return data;
    }

    @Override
    public String getDescricao() {
        return null;
    }

    @Override
    public String getTamanhoAnimal() {
        return tamanhoAnimal;
    }

    @Override
    public int getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "ServicoBase{" +
                "data=" + data +
                ", codigo=" + codigo +
                ", tamanhoAnimal='" + tamanhoAnimal + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicoBase that = (ServicoBase) o;
        return codigo == that.codigo && Double.compare(preco, that.preco) == 0 && Objects.equals(data, that.data) && Objects.equals(tamanhoAnimal, that.tamanhoAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamanhoAnimal, preco);
    }
}
