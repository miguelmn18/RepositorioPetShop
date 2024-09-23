import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Random;

public class Fachada {
    public ServicoPetShopIF criaServicoHotel(){
        Date data = new Date();
        Random rand = new Random();
        rand.doubles(1,10);
        return new Hotelzinho(data,rand,"Pequeno",9.90,5);
    }
    public ServicoPetShopIF criaServicoTosa(){
        return new Tosa();

    }
    public ServicoPetShopIF criaServicobanho(){
        return new Banho();
    }

}
