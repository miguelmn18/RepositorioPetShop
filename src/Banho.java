import java.time.LocalDate;

public class Banho extends ServicoBase {
    String tamanhoPelo;
    public Banho(LocalDate data, String codigo, String tamanhoAnimal, double preco, String tamanhoPelo) {
        super(data, codigo, tamanhoAnimal, preco);
        this.tamanhoPelo = tamanhoPelo;
    }

    public String getTamanhoPelo() {
        return tamanhoPelo;
    }

    public void setTamanhoPelo(String tamanhoPelo) {
        this.tamanhoPelo = tamanhoPelo;
    }
    public double getPreco(){
        return 0;
    }
    public String getDescricao(){
        return null;
    }
}
