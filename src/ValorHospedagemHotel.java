public enum ValorHospedagemHotel {

    PEQUENO(12),MEDIO(PEQUENO.getValor() + 6), GRANDE(PEQUENO.getValor() + 13),HORAMAXIMA(5);


    private final int valor;

    ValorHospedagemHotel(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
