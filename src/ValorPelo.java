public enum ValorPelo {

    CURTO(50),MEDIO(CURTO.getValor() + 15),LONGO(CURTO.getValor() + 25);


    private final int valor;

    ValorPelo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
