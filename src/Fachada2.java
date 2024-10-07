public class Fachada2  {

    public ServicoPetShopIF criaServicoBanho(int tamanhoAnimal, int tamanhoPelo) {
        int calculaValorDoBanho;
        String tamanhoPorteAninmal = getTamanhoPelo(tamanhoAnimal);
        String tamanhoPeloAnimal = getTamanhoPelo(tamanhoPelo);

        if (tamanhoPorteAninmal == null) {
            throw new IllegalArgumentException("Tamanho do animal inválido");

        }
        if (tamanhoPeloAnimal == null) {
            throw new IllegalArgumentException("Tamanho do pelo do animal inválido");
        }
        switch (tamanhoAnimal) {
            case 1:
                if (tamanhoPelo == 1) {
                    calculaValorDoBanho = ValorPrecoBanho.PORTEPEQUENO.getValor() + ValorPelo.CURTO.getValor();
                    return new Banho(getTamanhoAnimal(1), calculaValorDoBanho, getTamanhoPelo(1));
                }

            case 2:
                if (tamanhoPelo == 2) {
                    calculaValorDoBanho = ValorPrecoBanho.PORTEMEDIO.getValor() + ValorPelo.MEDIO.getValor();
                    return new Banho((getTamanhoAnimal(2)), calculaValorDoBanho, getTamanhoPelo(2));


                }
            case 3:
                if (tamanhoPelo == 3) {
                    calculaValorDoBanho = ValorPrecoBanho.PORTEGRANDE.getValor() + ValorPelo.LONGO.getValor();
                    return new Banho(getTamanhoAnimal(3), calculaValorDoBanho, getTamanhoPelo(3));
                }
            default:
                return null;

        }

    }
    public String getTamanhoPelo(int opcao) {
        switch (opcao){

            case 1: return  "CURTO";
            case 2: return "MÉDIO";
            case 3: return "LONGO";
            default: return null;

        }
    }

    public String getTamanhoAnimal(int opcao) {
        switch (opcao) {
            case 1: return "PEQUENO";
            case 2: return  "MÉDIO";
            case 3: return  "GRANDE";
            default: return null;
        }

    } public ServicoPetShopIF criaServicoHotelzinho (int opcaoTamanhoAnimal, int tempoReservadoNoHotelzinho) {
        int calculaValorServicoTosa;
        switch (opcaoTamanhoAnimal) {
            case 1:
                if (tempoReservadoNoHotelzinho == ValorHospedagemHotel.HORAMAXIMA.getValor()) {
                    calculaValorServicoTosa = ValorHospedagemHotel.PEQUENO.getValor() * tempoReservadoNoHotelzinho;
                    return new Hotelzinho(getTamanhoAnimal(1), calculaValorServicoTosa, tempoReservadoNoHotelzinho);
                }

            case 2:
                if (tempoReservadoNoHotelzinho == ValorHospedagemHotel.HORAMAXIMA.getValor()) {
                    calculaValorServicoTosa = ValorHospedagemHotel.MEDIO.getValor() * tempoReservadoNoHotelzinho;
                    return new Hotelzinho(getTamanhoAnimal(2), calculaValorServicoTosa, tempoReservadoNoHotelzinho);
                }


            case 3:
                if (tempoReservadoNoHotelzinho == ValorHospedagemHotel.HORAMAXIMA.getValor()) {
                    calculaValorServicoTosa = ValorHospedagemHotel.GRANDE.getValor() * tempoReservadoNoHotelzinho;
                    return new Hotelzinho(getTamanhoAnimal(3), calculaValorServicoTosa, tempoReservadoNoHotelzinho);
                } default: return null;
        }
    }  public ServicoPetShopIF criServicoTosa( int opcaoTamanhoAnimal){
        int calculaValorDaTosa;
        switch (opcaoTamanhoAnimal) {
            case 1:
                return new Tosa(getTamanhoAnimal(1), ValorServicoTosa.PEQUENO.getValor());

            case 2:
                return new Tosa(getTamanhoAnimal(2), ValorServicoTosa.MEDIO.getValor());

            case 3:
                return new Tosa(getTamanhoAnimal(3), ValorServicoTosa.GRANDE.getValor());

            default: return (ServicoPetShopIF) new IllegalArgumentException("Este tipo de serviço não existe.");
        }


    }



}

