public enum ValorPrecoBanho {
    PORTEPEQUENO(50), PORTEMEDIO(65), PORTEGRANDE(70);


    private final int valor;


    ValorPrecoBanho(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}
