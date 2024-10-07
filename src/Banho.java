import java.time.LocalDate;
import java.util.Date;

public class Banho extends ServicoBase {
    String tamanhoPelo;

    public Banho(String tamanhoAnimal, int preco, String tamanhoPelo) {
        super(tamanhoAnimal, preco);
        this.tamanhoPelo = tamanhoPelo;
    }

    public String getTamanhoPelo() {
        return tamanhoPelo;
    }

    public void setTamanhoPelo(String tamanhoPelo) {
        this.tamanhoPelo = tamanhoPelo;
    }

    public int getPreco(){
        return 0;
    }
    public String getDescricao(){
        return null;
    }
}
